package org.gradle.test.performance6_5;

import static org.junit.Assert.*;

public class Test6_453 {
    private final Production6_453 production = new Production6_453("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}