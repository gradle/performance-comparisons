package org.gradle.test.performance6_5;

import static org.junit.Assert.*;

public class Test6_480 {
    private final Production6_480 production = new Production6_480("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}