package org.gradle.test.performance6_3;

import static org.junit.Assert.*;

public class Test6_219 {
    private final Production6_219 production = new Production6_219("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}