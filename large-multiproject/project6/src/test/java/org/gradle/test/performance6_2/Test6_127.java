package org.gradle.test.performance6_2;

import static org.junit.Assert.*;

public class Test6_127 {
    private final Production6_127 production = new Production6_127("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}