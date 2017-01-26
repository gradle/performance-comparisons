package org.gradle.test.performance6_3;

import static org.junit.Assert.*;

public class Test6_242 {
    private final Production6_242 production = new Production6_242("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}