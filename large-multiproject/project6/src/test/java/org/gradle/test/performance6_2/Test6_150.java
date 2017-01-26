package org.gradle.test.performance6_2;

import static org.junit.Assert.*;

public class Test6_150 {
    private final Production6_150 production = new Production6_150("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}