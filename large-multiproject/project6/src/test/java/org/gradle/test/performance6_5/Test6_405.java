package org.gradle.test.performance6_5;

import static org.junit.Assert.*;

public class Test6_405 {
    private final Production6_405 production = new Production6_405("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}