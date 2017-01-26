package org.gradle.test.performance6_5;

import static org.junit.Assert.*;

public class Test6_443 {
    private final Production6_443 production = new Production6_443("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}