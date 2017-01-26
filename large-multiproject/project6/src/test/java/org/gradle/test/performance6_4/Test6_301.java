package org.gradle.test.performance6_4;

import static org.junit.Assert.*;

public class Test6_301 {
    private final Production6_301 production = new Production6_301("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}