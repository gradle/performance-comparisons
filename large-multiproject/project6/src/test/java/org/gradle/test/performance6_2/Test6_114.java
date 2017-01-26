package org.gradle.test.performance6_2;

import static org.junit.Assert.*;

public class Test6_114 {
    private final Production6_114 production = new Production6_114("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}