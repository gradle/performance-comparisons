package org.gradle.test.performance6_4;

import static org.junit.Assert.*;

public class Test6_376 {
    private final Production6_376 production = new Production6_376("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}