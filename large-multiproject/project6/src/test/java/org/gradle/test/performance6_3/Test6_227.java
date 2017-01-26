package org.gradle.test.performance6_3;

import static org.junit.Assert.*;

public class Test6_227 {
    private final Production6_227 production = new Production6_227("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}