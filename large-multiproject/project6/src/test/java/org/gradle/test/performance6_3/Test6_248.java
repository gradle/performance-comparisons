package org.gradle.test.performance6_3;

import static org.junit.Assert.*;

public class Test6_248 {
    private final Production6_248 production = new Production6_248("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}