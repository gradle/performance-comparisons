package org.gradle.test.performance6_4;

import static org.junit.Assert.*;

public class Test6_379 {
    private final Production6_379 production = new Production6_379("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}