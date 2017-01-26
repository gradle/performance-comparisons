package org.gradle.test.performance6_2;

import static org.junit.Assert.*;

public class Test6_140 {
    private final Production6_140 production = new Production6_140("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}