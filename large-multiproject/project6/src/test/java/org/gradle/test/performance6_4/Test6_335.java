package org.gradle.test.performance6_4;

import static org.junit.Assert.*;

public class Test6_335 {
    private final Production6_335 production = new Production6_335("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}