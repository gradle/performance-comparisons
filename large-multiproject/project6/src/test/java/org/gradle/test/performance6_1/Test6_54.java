package org.gradle.test.performance6_1;

import static org.junit.Assert.*;

public class Test6_54 {
    private final Production6_54 production = new Production6_54("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}