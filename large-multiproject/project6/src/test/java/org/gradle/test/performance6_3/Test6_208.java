package org.gradle.test.performance6_3;

import static org.junit.Assert.*;

public class Test6_208 {
    private final Production6_208 production = new Production6_208("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}