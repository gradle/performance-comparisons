package org.gradle.test.performance6_2;

import static org.junit.Assert.*;

public class Test6_136 {
    private final Production6_136 production = new Production6_136("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}