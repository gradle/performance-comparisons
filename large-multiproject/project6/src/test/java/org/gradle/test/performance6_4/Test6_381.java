package org.gradle.test.performance6_4;

import static org.junit.Assert.*;

public class Test6_381 {
    private final Production6_381 production = new Production6_381("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}