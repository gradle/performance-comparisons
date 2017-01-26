package org.gradle.test.performance6_3;

import static org.junit.Assert.*;

public class Test6_272 {
    private final Production6_272 production = new Production6_272("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}