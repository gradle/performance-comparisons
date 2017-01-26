package org.gradle.test.performance6_3;

import static org.junit.Assert.*;

public class Test6_247 {
    private final Production6_247 production = new Production6_247("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}