package org.gradle.test.performance6_3;

import static org.junit.Assert.*;

public class Test6_278 {
    private final Production6_278 production = new Production6_278("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}