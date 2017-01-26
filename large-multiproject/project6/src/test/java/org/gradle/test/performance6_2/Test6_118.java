package org.gradle.test.performance6_2;

import static org.junit.Assert.*;

public class Test6_118 {
    private final Production6_118 production = new Production6_118("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}