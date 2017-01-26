package org.gradle.test.performance6_1;

import static org.junit.Assert.*;

public class Test6_22 {
    private final Production6_22 production = new Production6_22("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}