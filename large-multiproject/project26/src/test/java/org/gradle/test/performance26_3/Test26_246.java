package org.gradle.test.performance26_3;

import static org.junit.Assert.*;

public class Test26_246 {
    private final Production26_246 production = new Production26_246("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}