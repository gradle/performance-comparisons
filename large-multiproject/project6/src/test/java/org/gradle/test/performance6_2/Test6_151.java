package org.gradle.test.performance6_2;

import static org.junit.Assert.*;

public class Test6_151 {
    private final Production6_151 production = new Production6_151("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}