package org.gradle.test.performance6_5;

import static org.junit.Assert.*;

public class Test6_411 {
    private final Production6_411 production = new Production6_411("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}