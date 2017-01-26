package org.gradle.test.performance6_1;

import static org.junit.Assert.*;

public class Test6_11 {
    private final Production6_11 production = new Production6_11("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}