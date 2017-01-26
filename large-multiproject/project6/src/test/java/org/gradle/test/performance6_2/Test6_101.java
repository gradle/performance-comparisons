package org.gradle.test.performance6_2;

import static org.junit.Assert.*;

public class Test6_101 {
    private final Production6_101 production = new Production6_101("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}