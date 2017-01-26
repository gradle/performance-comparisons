package org.gradle.test.performance6_5;

import static org.junit.Assert.*;

public class Test6_473 {
    private final Production6_473 production = new Production6_473("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}