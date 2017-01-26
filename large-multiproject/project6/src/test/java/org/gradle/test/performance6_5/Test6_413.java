package org.gradle.test.performance6_5;

import static org.junit.Assert.*;

public class Test6_413 {
    private final Production6_413 production = new Production6_413("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}