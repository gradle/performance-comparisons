package org.gradle.test.performance6_2;

import static org.junit.Assert.*;

public class Test6_176 {
    private final Production6_176 production = new Production6_176("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}