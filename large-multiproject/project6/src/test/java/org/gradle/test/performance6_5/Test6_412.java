package org.gradle.test.performance6_5;

import static org.junit.Assert.*;

public class Test6_412 {
    private final Production6_412 production = new Production6_412("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}