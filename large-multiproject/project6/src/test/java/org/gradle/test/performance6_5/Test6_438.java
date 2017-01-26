package org.gradle.test.performance6_5;

import static org.junit.Assert.*;

public class Test6_438 {
    private final Production6_438 production = new Production6_438("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}