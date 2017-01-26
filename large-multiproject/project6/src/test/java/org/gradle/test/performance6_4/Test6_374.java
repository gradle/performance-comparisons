package org.gradle.test.performance6_4;

import static org.junit.Assert.*;

public class Test6_374 {
    private final Production6_374 production = new Production6_374("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}