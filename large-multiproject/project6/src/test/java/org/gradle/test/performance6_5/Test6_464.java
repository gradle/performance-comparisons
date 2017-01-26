package org.gradle.test.performance6_5;

import static org.junit.Assert.*;

public class Test6_464 {
    private final Production6_464 production = new Production6_464("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}