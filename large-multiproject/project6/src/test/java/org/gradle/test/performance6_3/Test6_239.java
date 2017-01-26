package org.gradle.test.performance6_3;

import static org.junit.Assert.*;

public class Test6_239 {
    private final Production6_239 production = new Production6_239("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}