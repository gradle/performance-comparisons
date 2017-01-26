package org.gradle.test.performance26_3;

import static org.junit.Assert.*;

public class Test26_258 {
    private final Production26_258 production = new Production26_258("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}