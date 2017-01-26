package org.gradle.test.performance6_1;

import static org.junit.Assert.*;

public class Test6_13 {
    private final Production6_13 production = new Production6_13("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}