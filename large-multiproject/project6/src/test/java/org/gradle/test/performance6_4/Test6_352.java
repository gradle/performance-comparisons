package org.gradle.test.performance6_4;

import static org.junit.Assert.*;

public class Test6_352 {
    private final Production6_352 production = new Production6_352("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}