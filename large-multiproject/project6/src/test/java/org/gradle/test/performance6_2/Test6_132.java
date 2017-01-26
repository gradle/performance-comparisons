package org.gradle.test.performance6_2;

import static org.junit.Assert.*;

public class Test6_132 {
    private final Production6_132 production = new Production6_132("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}