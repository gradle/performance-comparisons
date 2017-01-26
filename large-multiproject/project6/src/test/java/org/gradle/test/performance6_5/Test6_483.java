package org.gradle.test.performance6_5;

import static org.junit.Assert.*;

public class Test6_483 {
    private final Production6_483 production = new Production6_483("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}