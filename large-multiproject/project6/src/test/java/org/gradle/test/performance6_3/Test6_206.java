package org.gradle.test.performance6_3;

import static org.junit.Assert.*;

public class Test6_206 {
    private final Production6_206 production = new Production6_206("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}