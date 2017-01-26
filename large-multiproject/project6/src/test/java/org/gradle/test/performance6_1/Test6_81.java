package org.gradle.test.performance6_1;

import static org.junit.Assert.*;

public class Test6_81 {
    private final Production6_81 production = new Production6_81("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}