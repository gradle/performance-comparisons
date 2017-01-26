package org.gradle.test.performance6_3;

import static org.junit.Assert.*;

public class Test6_210 {
    private final Production6_210 production = new Production6_210("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}