package org.gradle.test.performance6_2;

import static org.junit.Assert.*;

public class Test6_197 {
    private final Production6_197 production = new Production6_197("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}