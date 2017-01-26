package org.gradle.test.performance6_2;

import static org.junit.Assert.*;

public class Test6_146 {
    private final Production6_146 production = new Production6_146("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}