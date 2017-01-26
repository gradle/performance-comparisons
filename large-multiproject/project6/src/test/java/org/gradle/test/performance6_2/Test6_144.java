package org.gradle.test.performance6_2;

import static org.junit.Assert.*;

public class Test6_144 {
    private final Production6_144 production = new Production6_144("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}