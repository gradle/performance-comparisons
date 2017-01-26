package org.gradle.test.performance6_3;

import static org.junit.Assert.*;

public class Test6_252 {
    private final Production6_252 production = new Production6_252("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}