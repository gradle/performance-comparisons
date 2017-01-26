package org.gradle.test.performance6_5;

import static org.junit.Assert.*;

public class Test6_426 {
    private final Production6_426 production = new Production6_426("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}