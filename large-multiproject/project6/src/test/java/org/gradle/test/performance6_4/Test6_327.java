package org.gradle.test.performance6_4;

import static org.junit.Assert.*;

public class Test6_327 {
    private final Production6_327 production = new Production6_327("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}