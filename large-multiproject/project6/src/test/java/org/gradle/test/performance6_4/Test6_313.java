package org.gradle.test.performance6_4;

import static org.junit.Assert.*;

public class Test6_313 {
    private final Production6_313 production = new Production6_313("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}