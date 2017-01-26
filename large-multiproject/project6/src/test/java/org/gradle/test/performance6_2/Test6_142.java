package org.gradle.test.performance6_2;

import static org.junit.Assert.*;

public class Test6_142 {
    private final Production6_142 production = new Production6_142("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}