package org.gradle.test.performance6_5;

import static org.junit.Assert.*;

public class Test6_401 {
    private final Production6_401 production = new Production6_401("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}