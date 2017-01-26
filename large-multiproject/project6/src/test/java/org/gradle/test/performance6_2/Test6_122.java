package org.gradle.test.performance6_2;

import static org.junit.Assert.*;

public class Test6_122 {
    private final Production6_122 production = new Production6_122("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}