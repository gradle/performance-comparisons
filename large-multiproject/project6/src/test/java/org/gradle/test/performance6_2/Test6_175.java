package org.gradle.test.performance6_2;

import static org.junit.Assert.*;

public class Test6_175 {
    private final Production6_175 production = new Production6_175("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}