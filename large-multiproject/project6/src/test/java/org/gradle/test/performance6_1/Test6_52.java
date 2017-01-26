package org.gradle.test.performance6_1;

import static org.junit.Assert.*;

public class Test6_52 {
    private final Production6_52 production = new Production6_52("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}