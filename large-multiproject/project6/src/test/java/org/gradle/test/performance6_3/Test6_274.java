package org.gradle.test.performance6_3;

import static org.junit.Assert.*;

public class Test6_274 {
    private final Production6_274 production = new Production6_274("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}