package org.gradle.test.performance6_2;

import static org.junit.Assert.*;

public class Test6_143 {
    private final Production6_143 production = new Production6_143("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}