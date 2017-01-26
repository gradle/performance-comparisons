package org.gradle.test.performance6_2;

import static org.junit.Assert.*;

public class Test6_130 {
    private final Production6_130 production = new Production6_130("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}