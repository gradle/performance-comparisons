package org.gradle.test.performance6_5;

import static org.junit.Assert.*;

public class Test6_489 {
    private final Production6_489 production = new Production6_489("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}