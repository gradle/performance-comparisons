package org.gradle.test.performance6_1;

import static org.junit.Assert.*;

public class Test6_24 {
    private final Production6_24 production = new Production6_24("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}