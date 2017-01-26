package org.gradle.test.performance6_5;

import static org.junit.Assert.*;

public class Test6_490 {
    private final Production6_490 production = new Production6_490("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}