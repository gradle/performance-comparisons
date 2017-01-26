package org.gradle.test.performance6_3;

import static org.junit.Assert.*;

public class Test6_235 {
    private final Production6_235 production = new Production6_235("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}