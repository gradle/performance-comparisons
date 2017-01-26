package org.gradle.test.performance6_3;

import static org.junit.Assert.*;

public class Test6_299 {
    private final Production6_299 production = new Production6_299("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}