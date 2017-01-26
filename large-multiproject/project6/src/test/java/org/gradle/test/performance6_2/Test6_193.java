package org.gradle.test.performance6_2;

import static org.junit.Assert.*;

public class Test6_193 {
    private final Production6_193 production = new Production6_193("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}