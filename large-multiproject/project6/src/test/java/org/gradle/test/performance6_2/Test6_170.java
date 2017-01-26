package org.gradle.test.performance6_2;

import static org.junit.Assert.*;

public class Test6_170 {
    private final Production6_170 production = new Production6_170("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}