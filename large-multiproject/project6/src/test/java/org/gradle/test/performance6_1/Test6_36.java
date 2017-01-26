package org.gradle.test.performance6_1;

import static org.junit.Assert.*;

public class Test6_36 {
    private final Production6_36 production = new Production6_36("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}