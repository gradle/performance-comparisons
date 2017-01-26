package org.gradle.test.performance6_2;

import static org.junit.Assert.*;

public class Test6_113 {
    private final Production6_113 production = new Production6_113("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}