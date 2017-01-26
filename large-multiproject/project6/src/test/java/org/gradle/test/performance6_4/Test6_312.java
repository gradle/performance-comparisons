package org.gradle.test.performance6_4;

import static org.junit.Assert.*;

public class Test6_312 {
    private final Production6_312 production = new Production6_312("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}