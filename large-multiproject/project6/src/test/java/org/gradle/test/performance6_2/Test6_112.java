package org.gradle.test.performance6_2;

import static org.junit.Assert.*;

public class Test6_112 {
    private final Production6_112 production = new Production6_112("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}