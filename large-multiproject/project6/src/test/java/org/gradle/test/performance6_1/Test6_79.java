package org.gradle.test.performance6_1;

import static org.junit.Assert.*;

public class Test6_79 {
    private final Production6_79 production = new Production6_79("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}