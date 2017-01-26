package org.gradle.test.performance6_3;

import static org.junit.Assert.*;

public class Test6_254 {
    private final Production6_254 production = new Production6_254("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}