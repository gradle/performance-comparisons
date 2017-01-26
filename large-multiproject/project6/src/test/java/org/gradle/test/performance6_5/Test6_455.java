package org.gradle.test.performance6_5;

import static org.junit.Assert.*;

public class Test6_455 {
    private final Production6_455 production = new Production6_455("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}