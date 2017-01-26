package org.gradle.test.performance6_4;

import static org.junit.Assert.*;

public class Test6_340 {
    private final Production6_340 production = new Production6_340("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}