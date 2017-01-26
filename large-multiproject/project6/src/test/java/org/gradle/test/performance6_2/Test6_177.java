package org.gradle.test.performance6_2;

import static org.junit.Assert.*;

public class Test6_177 {
    private final Production6_177 production = new Production6_177("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}