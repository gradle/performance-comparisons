package org.gradle.test.performance6_5;

import static org.junit.Assert.*;

public class Test6_450 {
    private final Production6_450 production = new Production6_450("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}