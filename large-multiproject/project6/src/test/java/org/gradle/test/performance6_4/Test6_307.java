package org.gradle.test.performance6_4;

import static org.junit.Assert.*;

public class Test6_307 {
    private final Production6_307 production = new Production6_307("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}