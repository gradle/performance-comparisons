package org.gradle.test.performance6_5;

import static org.junit.Assert.*;

public class Test6_414 {
    private final Production6_414 production = new Production6_414("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}