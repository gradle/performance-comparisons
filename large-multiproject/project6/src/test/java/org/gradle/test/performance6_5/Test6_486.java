package org.gradle.test.performance6_5;

import static org.junit.Assert.*;

public class Test6_486 {
    private final Production6_486 production = new Production6_486("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}