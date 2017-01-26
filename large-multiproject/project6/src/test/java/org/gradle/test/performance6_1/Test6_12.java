package org.gradle.test.performance6_1;

import static org.junit.Assert.*;

public class Test6_12 {
    private final Production6_12 production = new Production6_12("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}