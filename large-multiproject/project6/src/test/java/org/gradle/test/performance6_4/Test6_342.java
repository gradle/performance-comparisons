package org.gradle.test.performance6_4;

import static org.junit.Assert.*;

public class Test6_342 {
    private final Production6_342 production = new Production6_342("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}