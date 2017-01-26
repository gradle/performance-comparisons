package org.gradle.test.performance6_3;

import static org.junit.Assert.*;

public class Test6_233 {
    private final Production6_233 production = new Production6_233("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}