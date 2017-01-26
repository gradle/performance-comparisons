package org.gradle.test.performance6_3;

import static org.junit.Assert.*;

public class Test6_258 {
    private final Production6_258 production = new Production6_258("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}