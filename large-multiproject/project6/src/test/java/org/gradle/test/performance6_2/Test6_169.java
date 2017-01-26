package org.gradle.test.performance6_2;

import static org.junit.Assert.*;

public class Test6_169 {
    private final Production6_169 production = new Production6_169("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}