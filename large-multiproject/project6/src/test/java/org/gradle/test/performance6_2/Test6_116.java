package org.gradle.test.performance6_2;

import static org.junit.Assert.*;

public class Test6_116 {
    private final Production6_116 production = new Production6_116("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}