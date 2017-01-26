package org.gradle.test.performance6_2;

import static org.junit.Assert.*;

public class Test6_103 {
    private final Production6_103 production = new Production6_103("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}