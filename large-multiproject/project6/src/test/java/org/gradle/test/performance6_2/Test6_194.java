package org.gradle.test.performance6_2;

import static org.junit.Assert.*;

public class Test6_194 {
    private final Production6_194 production = new Production6_194("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}