package org.gradle.test.performance6_5;

import static org.junit.Assert.*;

public class Test6_459 {
    private final Production6_459 production = new Production6_459("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}