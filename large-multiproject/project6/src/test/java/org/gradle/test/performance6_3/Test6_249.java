package org.gradle.test.performance6_3;

import static org.junit.Assert.*;

public class Test6_249 {
    private final Production6_249 production = new Production6_249("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}