package org.gradle.test.performance6_5;

import static org.junit.Assert.*;

public class Test6_418 {
    private final Production6_418 production = new Production6_418("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}