package org.gradle.test.performance6_5;

import static org.junit.Assert.*;

public class Test6_402 {
    private final Production6_402 production = new Production6_402("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}