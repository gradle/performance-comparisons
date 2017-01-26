package org.gradle.test.performance6_2;

import static org.junit.Assert.*;

public class Test6_182 {
    private final Production6_182 production = new Production6_182("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}