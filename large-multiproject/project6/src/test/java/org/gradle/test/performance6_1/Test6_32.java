package org.gradle.test.performance6_1;

import static org.junit.Assert.*;

public class Test6_32 {
    private final Production6_32 production = new Production6_32("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}