package org.gradle.test.performance6_2;

import static org.junit.Assert.*;

public class Test6_141 {
    private final Production6_141 production = new Production6_141("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}