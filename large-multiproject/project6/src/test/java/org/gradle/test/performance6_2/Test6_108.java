package org.gradle.test.performance6_2;

import static org.junit.Assert.*;

public class Test6_108 {
    private final Production6_108 production = new Production6_108("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}