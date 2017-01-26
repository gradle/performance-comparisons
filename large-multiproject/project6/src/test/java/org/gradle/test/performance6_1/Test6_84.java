package org.gradle.test.performance6_1;

import static org.junit.Assert.*;

public class Test6_84 {
    private final Production6_84 production = new Production6_84("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}