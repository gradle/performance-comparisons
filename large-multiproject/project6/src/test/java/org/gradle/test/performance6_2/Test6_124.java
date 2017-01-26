package org.gradle.test.performance6_2;

import static org.junit.Assert.*;

public class Test6_124 {
    private final Production6_124 production = new Production6_124("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}