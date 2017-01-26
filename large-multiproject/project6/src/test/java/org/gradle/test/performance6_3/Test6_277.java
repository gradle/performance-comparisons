package org.gradle.test.performance6_3;

import static org.junit.Assert.*;

public class Test6_277 {
    private final Production6_277 production = new Production6_277("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}