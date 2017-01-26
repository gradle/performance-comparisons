package org.gradle.test.performance6_4;

import static org.junit.Assert.*;

public class Test6_336 {
    private final Production6_336 production = new Production6_336("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}