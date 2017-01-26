package org.gradle.test.performance6_2;

import static org.junit.Assert.*;

public class Test6_159 {
    private final Production6_159 production = new Production6_159("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}