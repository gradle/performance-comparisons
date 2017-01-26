package org.gradle.test.performance6_5;

import static org.junit.Assert.*;

public class Test6_428 {
    private final Production6_428 production = new Production6_428("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}