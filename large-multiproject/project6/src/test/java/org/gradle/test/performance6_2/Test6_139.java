package org.gradle.test.performance6_2;

import static org.junit.Assert.*;

public class Test6_139 {
    private final Production6_139 production = new Production6_139("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}