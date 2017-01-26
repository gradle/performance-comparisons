package org.gradle.test.performance6_3;

import static org.junit.Assert.*;

public class Test6_271 {
    private final Production6_271 production = new Production6_271("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}