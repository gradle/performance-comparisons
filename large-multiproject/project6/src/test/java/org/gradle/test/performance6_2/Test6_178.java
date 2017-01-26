package org.gradle.test.performance6_2;

import static org.junit.Assert.*;

public class Test6_178 {
    private final Production6_178 production = new Production6_178("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}