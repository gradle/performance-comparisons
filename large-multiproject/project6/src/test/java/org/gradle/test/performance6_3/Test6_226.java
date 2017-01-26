package org.gradle.test.performance6_3;

import static org.junit.Assert.*;

public class Test6_226 {
    private final Production6_226 production = new Production6_226("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}