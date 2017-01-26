package org.gradle.test.performance6_1;

import static org.junit.Assert.*;

public class Test6_59 {
    private final Production6_59 production = new Production6_59("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}