package org.gradle.test.performance6_1;

import static org.junit.Assert.*;

public class Test6_63 {
    private final Production6_63 production = new Production6_63("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}