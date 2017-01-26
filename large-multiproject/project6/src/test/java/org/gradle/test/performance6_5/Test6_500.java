package org.gradle.test.performance6_5;

import static org.junit.Assert.*;

public class Test6_500 {
    private final Production6_500 production = new Production6_500("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}