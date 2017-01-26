package org.gradle.test.performance6_3;

import static org.junit.Assert.*;

public class Test6_284 {
    private final Production6_284 production = new Production6_284("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}