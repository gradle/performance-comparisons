package org.gradle.test.performance6_3;

import static org.junit.Assert.*;

public class Test6_259 {
    private final Production6_259 production = new Production6_259("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}