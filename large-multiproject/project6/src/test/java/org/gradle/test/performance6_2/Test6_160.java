package org.gradle.test.performance6_2;

import static org.junit.Assert.*;

public class Test6_160 {
    private final Production6_160 production = new Production6_160("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}