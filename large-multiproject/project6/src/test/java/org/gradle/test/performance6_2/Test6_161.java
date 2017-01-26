package org.gradle.test.performance6_2;

import static org.junit.Assert.*;

public class Test6_161 {
    private final Production6_161 production = new Production6_161("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}