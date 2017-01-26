package org.gradle.test.performance13_4;

import static org.junit.Assert.*;

public class Test13_397 {
    private final Production13_397 production = new Production13_397("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}