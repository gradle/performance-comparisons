package org.gradle.test.performance6_4;

import static org.junit.Assert.*;

public class Test6_370 {
    private final Production6_370 production = new Production6_370("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}