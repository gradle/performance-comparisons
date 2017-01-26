package org.gradle.test.performance6_2;

import static org.junit.Assert.*;

public class Test6_133 {
    private final Production6_133 production = new Production6_133("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}