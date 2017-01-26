package org.gradle.test.performance6_5;

import static org.junit.Assert.*;

public class Test6_496 {
    private final Production6_496 production = new Production6_496("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}