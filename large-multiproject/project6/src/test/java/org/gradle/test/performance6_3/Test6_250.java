package org.gradle.test.performance6_3;

import static org.junit.Assert.*;

public class Test6_250 {
    private final Production6_250 production = new Production6_250("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}