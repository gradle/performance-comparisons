package org.gradle.test.performance6_5;

import static org.junit.Assert.*;

public class Test6_466 {
    private final Production6_466 production = new Production6_466("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}