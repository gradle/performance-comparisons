package org.gradle.test.performance6_2;

import static org.junit.Assert.*;

public class Test6_187 {
    private final Production6_187 production = new Production6_187("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}