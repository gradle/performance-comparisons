package org.gradle.test.performance6_5;

import static org.junit.Assert.*;

public class Test6_446 {
    private final Production6_446 production = new Production6_446("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}