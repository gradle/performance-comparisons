package org.gradle.test.performance6_5;

import static org.junit.Assert.*;

public class Test6_430 {
    private final Production6_430 production = new Production6_430("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}