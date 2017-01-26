package org.gradle.test.performance6_5;

import static org.junit.Assert.*;

public class Test6_439 {
    private final Production6_439 production = new Production6_439("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}