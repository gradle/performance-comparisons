package org.gradle.test.performance6_1;

import static org.junit.Assert.*;

public class Test6_70 {
    private final Production6_70 production = new Production6_70("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}