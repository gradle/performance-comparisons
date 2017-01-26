package org.gradle.test.performance6_4;

import static org.junit.Assert.*;

public class Test6_349 {
    private final Production6_349 production = new Production6_349("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}