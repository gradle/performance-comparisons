package org.gradle.test.performance6_3;

import static org.junit.Assert.*;

public class Test6_223 {
    private final Production6_223 production = new Production6_223("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}