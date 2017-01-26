package org.gradle.test.performance6_4;

import static org.junit.Assert.*;

public class Test6_328 {
    private final Production6_328 production = new Production6_328("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}