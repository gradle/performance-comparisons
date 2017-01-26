package org.gradle.test.performance6_2;

import static org.junit.Assert.*;

public class Test6_129 {
    private final Production6_129 production = new Production6_129("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}