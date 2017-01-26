package org.gradle.test.performance6_1;

import static org.junit.Assert.*;

public class Test6_92 {
    private final Production6_92 production = new Production6_92("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}