package org.gradle.test.performance6_5;

import static org.junit.Assert.*;

public class Test6_478 {
    private final Production6_478 production = new Production6_478("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}