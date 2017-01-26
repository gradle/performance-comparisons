package org.gradle.test.performance6_3;

import static org.junit.Assert.*;

public class Test6_256 {
    private final Production6_256 production = new Production6_256("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}