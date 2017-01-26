package org.gradle.test.performance6_1;

import static org.junit.Assert.*;

public class Test6_33 {
    private final Production6_33 production = new Production6_33("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}