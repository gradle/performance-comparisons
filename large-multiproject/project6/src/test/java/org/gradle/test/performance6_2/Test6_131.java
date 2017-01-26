package org.gradle.test.performance6_2;

import static org.junit.Assert.*;

public class Test6_131 {
    private final Production6_131 production = new Production6_131("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}