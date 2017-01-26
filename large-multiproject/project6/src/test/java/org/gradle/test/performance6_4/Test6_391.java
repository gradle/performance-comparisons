package org.gradle.test.performance6_4;

import static org.junit.Assert.*;

public class Test6_391 {
    private final Production6_391 production = new Production6_391("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}