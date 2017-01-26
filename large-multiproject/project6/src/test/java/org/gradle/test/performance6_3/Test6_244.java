package org.gradle.test.performance6_3;

import static org.junit.Assert.*;

public class Test6_244 {
    private final Production6_244 production = new Production6_244("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}