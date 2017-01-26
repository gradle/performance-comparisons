package org.gradle.test.performance6_2;

import static org.junit.Assert.*;

public class Test6_105 {
    private final Production6_105 production = new Production6_105("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}