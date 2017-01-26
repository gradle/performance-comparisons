package org.gradle.test.performance6_4;

import static org.junit.Assert.*;

public class Test6_333 {
    private final Production6_333 production = new Production6_333("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}