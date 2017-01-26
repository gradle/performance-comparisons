package org.gradle.test.performance6_4;

import static org.junit.Assert.*;

public class Test6_377 {
    private final Production6_377 production = new Production6_377("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}