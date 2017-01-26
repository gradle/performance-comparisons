package org.gradle.test.performance6_4;

import static org.junit.Assert.*;

public class Test6_334 {
    private final Production6_334 production = new Production6_334("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}