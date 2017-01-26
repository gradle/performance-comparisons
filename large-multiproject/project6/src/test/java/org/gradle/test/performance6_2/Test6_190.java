package org.gradle.test.performance6_2;

import static org.junit.Assert.*;

public class Test6_190 {
    private final Production6_190 production = new Production6_190("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}