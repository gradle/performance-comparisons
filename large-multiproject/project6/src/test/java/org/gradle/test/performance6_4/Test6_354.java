package org.gradle.test.performance6_4;

import static org.junit.Assert.*;

public class Test6_354 {
    private final Production6_354 production = new Production6_354("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}