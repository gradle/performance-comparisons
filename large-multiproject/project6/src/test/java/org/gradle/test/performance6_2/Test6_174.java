package org.gradle.test.performance6_2;

import static org.junit.Assert.*;

public class Test6_174 {
    private final Production6_174 production = new Production6_174("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}