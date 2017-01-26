package org.gradle.test.performance6_4;

import static org.junit.Assert.*;

public class Test6_311 {
    private final Production6_311 production = new Production6_311("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}