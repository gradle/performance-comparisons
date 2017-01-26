package org.gradle.test.performance6_5;

import static org.junit.Assert.*;

public class Test6_484 {
    private final Production6_484 production = new Production6_484("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}