package org.gradle.test.performance6_1;

import static org.junit.Assert.*;

public class Test6_35 {
    private final Production6_35 production = new Production6_35("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}