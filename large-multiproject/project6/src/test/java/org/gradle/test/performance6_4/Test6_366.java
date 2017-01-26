package org.gradle.test.performance6_4;

import static org.junit.Assert.*;

public class Test6_366 {
    private final Production6_366 production = new Production6_366("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}