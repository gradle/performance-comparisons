package org.gradle.test.performance6_2;

import static org.junit.Assert.*;

public class Test6_196 {
    private final Production6_196 production = new Production6_196("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}