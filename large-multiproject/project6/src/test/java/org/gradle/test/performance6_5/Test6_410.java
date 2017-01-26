package org.gradle.test.performance6_5;

import static org.junit.Assert.*;

public class Test6_410 {
    private final Production6_410 production = new Production6_410("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}