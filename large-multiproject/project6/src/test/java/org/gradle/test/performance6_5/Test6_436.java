package org.gradle.test.performance6_5;

import static org.junit.Assert.*;

public class Test6_436 {
    private final Production6_436 production = new Production6_436("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}