package org.gradle.test.performance6_2;

import static org.junit.Assert.*;

public class Test6_173 {
    private final Production6_173 production = new Production6_173("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}