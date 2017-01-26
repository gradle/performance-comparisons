package org.gradle.test.performance6_4;

import static org.junit.Assert.*;

public class Test6_400 {
    private final Production6_400 production = new Production6_400("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}