package org.gradle.test.performance6_1;

import static org.junit.Assert.*;

public class Test6_83 {
    private final Production6_83 production = new Production6_83("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}