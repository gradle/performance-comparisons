package org.gradle.test.performance6_4;

import static org.junit.Assert.*;

public class Test6_339 {
    private final Production6_339 production = new Production6_339("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}