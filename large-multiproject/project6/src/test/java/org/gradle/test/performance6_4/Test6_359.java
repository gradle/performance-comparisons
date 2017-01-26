package org.gradle.test.performance6_4;

import static org.junit.Assert.*;

public class Test6_359 {
    private final Production6_359 production = new Production6_359("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}