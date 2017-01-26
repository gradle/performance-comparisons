package org.gradle.test.performance6_1;

import static org.junit.Assert.*;

public class Test6_19 {
    private final Production6_19 production = new Production6_19("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}