package org.gradle.test.performance26_3;

import static org.junit.Assert.*;

public class Test26_280 {
    private final Production26_280 production = new Production26_280("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}