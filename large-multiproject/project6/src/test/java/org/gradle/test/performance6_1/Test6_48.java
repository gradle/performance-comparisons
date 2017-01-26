package org.gradle.test.performance6_1;

import static org.junit.Assert.*;

public class Test6_48 {
    private final Production6_48 production = new Production6_48("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}