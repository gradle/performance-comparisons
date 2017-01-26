package org.gradle.test.performance6_2;

import static org.junit.Assert.*;

public class Test6_106 {
    private final Production6_106 production = new Production6_106("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}