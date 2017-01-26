package org.gradle.test.performance6_3;

import static org.junit.Assert.*;

public class Test6_236 {
    private final Production6_236 production = new Production6_236("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}