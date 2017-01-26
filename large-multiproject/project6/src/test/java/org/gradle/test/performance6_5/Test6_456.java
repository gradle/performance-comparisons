package org.gradle.test.performance6_5;

import static org.junit.Assert.*;

public class Test6_456 {
    private final Production6_456 production = new Production6_456("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}