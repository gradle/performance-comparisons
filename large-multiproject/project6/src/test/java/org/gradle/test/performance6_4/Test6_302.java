package org.gradle.test.performance6_4;

import static org.junit.Assert.*;

public class Test6_302 {
    private final Production6_302 production = new Production6_302("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}