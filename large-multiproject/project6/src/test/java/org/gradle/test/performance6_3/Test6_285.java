package org.gradle.test.performance6_3;

import static org.junit.Assert.*;

public class Test6_285 {
    private final Production6_285 production = new Production6_285("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}