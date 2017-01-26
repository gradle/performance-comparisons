package org.gradle.test.performance6_4;

import static org.junit.Assert.*;

public class Test6_363 {
    private final Production6_363 production = new Production6_363("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}