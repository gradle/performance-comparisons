package org.gradle.test.performance6_4;

import static org.junit.Assert.*;

public class Test6_355 {
    private final Production6_355 production = new Production6_355("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}