package org.gradle.test.performance6_5;

import static org.junit.Assert.*;

public class Test6_454 {
    private final Production6_454 production = new Production6_454("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}