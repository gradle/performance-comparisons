package org.gradle.test.performance6_3;

import static org.junit.Assert.*;

public class Test6_262 {
    private final Production6_262 production = new Production6_262("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}