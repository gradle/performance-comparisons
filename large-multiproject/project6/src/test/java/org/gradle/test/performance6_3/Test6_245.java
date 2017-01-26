package org.gradle.test.performance6_3;

import static org.junit.Assert.*;

public class Test6_245 {
    private final Production6_245 production = new Production6_245("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}