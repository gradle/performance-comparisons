package org.gradle.test.performance6_4;

import static org.junit.Assert.*;

public class Test6_380 {
    private final Production6_380 production = new Production6_380("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}