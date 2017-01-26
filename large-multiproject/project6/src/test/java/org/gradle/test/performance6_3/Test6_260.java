package org.gradle.test.performance6_3;

import static org.junit.Assert.*;

public class Test6_260 {
    private final Production6_260 production = new Production6_260("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}