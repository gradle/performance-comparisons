package org.gradle.test.performance6_5;

import static org.junit.Assert.*;

public class Test6_407 {
    private final Production6_407 production = new Production6_407("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}