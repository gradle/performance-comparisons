package org.gradle.test.performance6_5;

import static org.junit.Assert.*;

public class Test6_421 {
    private final Production6_421 production = new Production6_421("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}