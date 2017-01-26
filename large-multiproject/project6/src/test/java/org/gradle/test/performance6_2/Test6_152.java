package org.gradle.test.performance6_2;

import static org.junit.Assert.*;

public class Test6_152 {
    private final Production6_152 production = new Production6_152("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}