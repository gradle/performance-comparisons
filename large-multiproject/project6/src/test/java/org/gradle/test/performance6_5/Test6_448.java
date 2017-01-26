package org.gradle.test.performance6_5;

import static org.junit.Assert.*;

public class Test6_448 {
    private final Production6_448 production = new Production6_448("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}