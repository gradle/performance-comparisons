package org.gradle.test.performance6_2;

import static org.junit.Assert.*;

public class Test6_192 {
    private final Production6_192 production = new Production6_192("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}