package org.gradle.test.performance6_2;

import static org.junit.Assert.*;

public class Test6_153 {
    private final Production6_153 production = new Production6_153("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}