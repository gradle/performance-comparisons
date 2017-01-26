package org.gradle.test.performance6_4;

import static org.junit.Assert.*;

public class Test6_345 {
    private final Production6_345 production = new Production6_345("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}