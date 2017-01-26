package org.gradle.test.performance6_5;

import static org.junit.Assert.*;

public class Test6_420 {
    private final Production6_420 production = new Production6_420("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}