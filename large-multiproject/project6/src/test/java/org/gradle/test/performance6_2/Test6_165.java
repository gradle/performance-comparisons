package org.gradle.test.performance6_2;

import static org.junit.Assert.*;

public class Test6_165 {
    private final Production6_165 production = new Production6_165("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}