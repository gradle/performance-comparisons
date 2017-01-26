package org.gradle.test.performance6_2;

import static org.junit.Assert.*;

public class Test6_123 {
    private final Production6_123 production = new Production6_123("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}