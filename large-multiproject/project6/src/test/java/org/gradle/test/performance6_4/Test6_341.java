package org.gradle.test.performance6_4;

import static org.junit.Assert.*;

public class Test6_341 {
    private final Production6_341 production = new Production6_341("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}