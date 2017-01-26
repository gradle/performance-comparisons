package org.gradle.test.performance6_5;

import static org.junit.Assert.*;

public class Test6_417 {
    private final Production6_417 production = new Production6_417("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}