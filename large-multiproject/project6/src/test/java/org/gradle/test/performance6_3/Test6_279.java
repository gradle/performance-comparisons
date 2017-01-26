package org.gradle.test.performance6_3;

import static org.junit.Assert.*;

public class Test6_279 {
    private final Production6_279 production = new Production6_279("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}