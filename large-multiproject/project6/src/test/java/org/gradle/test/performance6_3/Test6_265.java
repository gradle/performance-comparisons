package org.gradle.test.performance6_3;

import static org.junit.Assert.*;

public class Test6_265 {
    private final Production6_265 production = new Production6_265("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}