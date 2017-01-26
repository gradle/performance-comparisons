package org.gradle.test.performance6_3;

import static org.junit.Assert.*;

public class Test6_217 {
    private final Production6_217 production = new Production6_217("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}