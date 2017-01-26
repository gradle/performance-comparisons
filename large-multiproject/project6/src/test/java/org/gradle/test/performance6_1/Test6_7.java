package org.gradle.test.performance6_1;

import static org.junit.Assert.*;

public class Test6_7 {
    private final Production6_7 production = new Production6_7("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}