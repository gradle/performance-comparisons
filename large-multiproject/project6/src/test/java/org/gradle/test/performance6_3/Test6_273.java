package org.gradle.test.performance6_3;

import static org.junit.Assert.*;

public class Test6_273 {
    private final Production6_273 production = new Production6_273("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}