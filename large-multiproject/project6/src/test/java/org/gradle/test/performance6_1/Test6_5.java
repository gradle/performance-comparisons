package org.gradle.test.performance6_1;

import static org.junit.Assert.*;

public class Test6_5 {
    private final Production6_5 production = new Production6_5("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}