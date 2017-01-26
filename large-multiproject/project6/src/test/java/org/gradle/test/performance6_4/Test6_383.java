package org.gradle.test.performance6_4;

import static org.junit.Assert.*;

public class Test6_383 {
    private final Production6_383 production = new Production6_383("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}