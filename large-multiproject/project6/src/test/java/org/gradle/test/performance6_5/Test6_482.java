package org.gradle.test.performance6_5;

import static org.junit.Assert.*;

public class Test6_482 {
    private final Production6_482 production = new Production6_482("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}