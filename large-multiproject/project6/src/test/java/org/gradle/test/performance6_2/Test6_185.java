package org.gradle.test.performance6_2;

import static org.junit.Assert.*;

public class Test6_185 {
    private final Production6_185 production = new Production6_185("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}