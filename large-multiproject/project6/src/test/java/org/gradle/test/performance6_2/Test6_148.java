package org.gradle.test.performance6_2;

import static org.junit.Assert.*;

public class Test6_148 {
    private final Production6_148 production = new Production6_148("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}