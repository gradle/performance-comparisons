package org.gradle.test.performance6_4;

import static org.junit.Assert.*;

public class Test6_351 {
    private final Production6_351 production = new Production6_351("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}