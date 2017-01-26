package org.gradle.test.performance6_1;

import static org.junit.Assert.*;

public class Test6_69 {
    private final Production6_69 production = new Production6_69("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}