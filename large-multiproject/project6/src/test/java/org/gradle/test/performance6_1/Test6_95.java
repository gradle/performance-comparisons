package org.gradle.test.performance6_1;

import static org.junit.Assert.*;

public class Test6_95 {
    private final Production6_95 production = new Production6_95("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}