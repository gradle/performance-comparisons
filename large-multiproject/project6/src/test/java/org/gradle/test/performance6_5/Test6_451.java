package org.gradle.test.performance6_5;

import static org.junit.Assert.*;

public class Test6_451 {
    private final Production6_451 production = new Production6_451("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}