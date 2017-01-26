package org.gradle.test.performance6_3;

import static org.junit.Assert.*;

public class Test6_218 {
    private final Production6_218 production = new Production6_218("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}