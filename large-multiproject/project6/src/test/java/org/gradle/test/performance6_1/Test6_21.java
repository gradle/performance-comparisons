package org.gradle.test.performance6_1;

import static org.junit.Assert.*;

public class Test6_21 {
    private final Production6_21 production = new Production6_21("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}