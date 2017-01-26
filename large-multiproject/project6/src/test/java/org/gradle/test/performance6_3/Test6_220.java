package org.gradle.test.performance6_3;

import static org.junit.Assert.*;

public class Test6_220 {
    private final Production6_220 production = new Production6_220("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}