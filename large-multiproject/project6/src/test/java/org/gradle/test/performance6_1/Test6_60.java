package org.gradle.test.performance6_1;

import static org.junit.Assert.*;

public class Test6_60 {
    private final Production6_60 production = new Production6_60("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}