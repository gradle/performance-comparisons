package org.gradle.test.performance6_2;

import static org.junit.Assert.*;

public class Test6_121 {
    private final Production6_121 production = new Production6_121("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}