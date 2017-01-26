package org.gradle.test.performance6_5;

import static org.junit.Assert.*;

public class Test6_494 {
    private final Production6_494 production = new Production6_494("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}