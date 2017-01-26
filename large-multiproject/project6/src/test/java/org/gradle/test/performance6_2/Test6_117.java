package org.gradle.test.performance6_2;

import static org.junit.Assert.*;

public class Test6_117 {
    private final Production6_117 production = new Production6_117("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}