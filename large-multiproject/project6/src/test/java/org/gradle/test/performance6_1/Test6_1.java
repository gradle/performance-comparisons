package org.gradle.test.performance6_1;

import static org.junit.Assert.*;

public class Test6_1 {
    private final Production6_1 production = new Production6_1("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}