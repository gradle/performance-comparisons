package org.gradle.test.performance6_2;

import static org.junit.Assert.*;

public class Test6_163 {
    private final Production6_163 production = new Production6_163("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}