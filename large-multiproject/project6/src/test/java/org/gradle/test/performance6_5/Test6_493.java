package org.gradle.test.performance6_5;

import static org.junit.Assert.*;

public class Test6_493 {
    private final Production6_493 production = new Production6_493("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}