package org.gradle.test.performance6_1;

import static org.junit.Assert.*;

public class Test6_56 {
    private final Production6_56 production = new Production6_56("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}