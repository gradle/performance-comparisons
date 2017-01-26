package org.gradle.test.performance6_4;

import static org.junit.Assert.*;

public class Test6_397 {
    private final Production6_397 production = new Production6_397("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}