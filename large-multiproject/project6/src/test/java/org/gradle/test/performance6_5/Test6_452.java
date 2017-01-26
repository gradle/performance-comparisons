package org.gradle.test.performance6_5;

import static org.junit.Assert.*;

public class Test6_452 {
    private final Production6_452 production = new Production6_452("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}