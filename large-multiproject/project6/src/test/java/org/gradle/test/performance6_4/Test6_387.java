package org.gradle.test.performance6_4;

import static org.junit.Assert.*;

public class Test6_387 {
    private final Production6_387 production = new Production6_387("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}