package org.gradle.test.performance6_1;

import static org.junit.Assert.*;

public class Test6_47 {
    private final Production6_47 production = new Production6_47("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}