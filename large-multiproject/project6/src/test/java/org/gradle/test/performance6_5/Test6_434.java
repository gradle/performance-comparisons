package org.gradle.test.performance6_5;

import static org.junit.Assert.*;

public class Test6_434 {
    private final Production6_434 production = new Production6_434("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}