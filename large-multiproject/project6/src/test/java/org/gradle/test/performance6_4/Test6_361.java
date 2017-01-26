package org.gradle.test.performance6_4;

import static org.junit.Assert.*;

public class Test6_361 {
    private final Production6_361 production = new Production6_361("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}