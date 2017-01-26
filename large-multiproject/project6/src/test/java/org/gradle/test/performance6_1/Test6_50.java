package org.gradle.test.performance6_1;

import static org.junit.Assert.*;

public class Test6_50 {
    private final Production6_50 production = new Production6_50("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}