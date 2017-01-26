package org.gradle.test.performance6_5;

import static org.junit.Assert.*;

public class Test6_433 {
    private final Production6_433 production = new Production6_433("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}