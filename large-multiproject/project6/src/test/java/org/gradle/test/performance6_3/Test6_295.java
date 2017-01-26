package org.gradle.test.performance6_3;

import static org.junit.Assert.*;

public class Test6_295 {
    private final Production6_295 production = new Production6_295("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}