package org.gradle.test.performance6_5;

import static org.junit.Assert.*;

public class Test6_429 {
    private final Production6_429 production = new Production6_429("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}