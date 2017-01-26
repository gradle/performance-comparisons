package org.gradle.test.performance6_4;

import static org.junit.Assert.*;

public class Test6_357 {
    private final Production6_357 production = new Production6_357("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}