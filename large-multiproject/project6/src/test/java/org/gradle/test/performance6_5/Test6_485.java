package org.gradle.test.performance6_5;

import static org.junit.Assert.*;

public class Test6_485 {
    private final Production6_485 production = new Production6_485("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}