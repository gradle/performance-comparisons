package org.gradle.test.performance6_3;

import static org.junit.Assert.*;

public class Test6_201 {
    private final Production6_201 production = new Production6_201("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}