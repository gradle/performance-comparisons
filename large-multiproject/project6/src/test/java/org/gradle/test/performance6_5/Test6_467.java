package org.gradle.test.performance6_5;

import static org.junit.Assert.*;

public class Test6_467 {
    private final Production6_467 production = new Production6_467("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}