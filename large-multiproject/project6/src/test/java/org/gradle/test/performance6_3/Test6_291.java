package org.gradle.test.performance6_3;

import static org.junit.Assert.*;

public class Test6_291 {
    private final Production6_291 production = new Production6_291("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}