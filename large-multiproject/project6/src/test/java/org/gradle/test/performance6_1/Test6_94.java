package org.gradle.test.performance6_1;

import static org.junit.Assert.*;

public class Test6_94 {
    private final Production6_94 production = new Production6_94("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}