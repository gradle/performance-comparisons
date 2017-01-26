package org.gradle.test.performance6_3;

import static org.junit.Assert.*;

public class Test6_276 {
    private final Production6_276 production = new Production6_276("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}