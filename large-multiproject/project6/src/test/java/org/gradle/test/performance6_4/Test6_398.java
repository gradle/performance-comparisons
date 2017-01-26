package org.gradle.test.performance6_4;

import static org.junit.Assert.*;

public class Test6_398 {
    private final Production6_398 production = new Production6_398("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}