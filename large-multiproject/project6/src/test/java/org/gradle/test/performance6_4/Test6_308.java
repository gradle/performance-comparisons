package org.gradle.test.performance6_4;

import static org.junit.Assert.*;

public class Test6_308 {
    private final Production6_308 production = new Production6_308("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}