package org.gradle.test.performance6_2;

import static org.junit.Assert.*;

public class Test6_179 {
    private final Production6_179 production = new Production6_179("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}