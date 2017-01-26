package org.gradle.test.performance6_4;

import static org.junit.Assert.*;

public class Test6_321 {
    private final Production6_321 production = new Production6_321("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}