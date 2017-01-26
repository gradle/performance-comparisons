package org.gradle.test.performance6_1;

import static org.junit.Assert.*;

public class Test6_86 {
    private final Production6_86 production = new Production6_86("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}