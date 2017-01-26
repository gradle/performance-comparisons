package org.gradle.test.performance6_4;

import static org.junit.Assert.*;

public class Test6_394 {
    private final Production6_394 production = new Production6_394("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}