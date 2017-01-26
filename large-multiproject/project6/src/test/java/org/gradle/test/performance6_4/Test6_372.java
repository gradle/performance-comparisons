package org.gradle.test.performance6_4;

import static org.junit.Assert.*;

public class Test6_372 {
    private final Production6_372 production = new Production6_372("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}