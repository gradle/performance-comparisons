package org.gradle.test.performance6_3;

import static org.junit.Assert.*;

public class Test6_243 {
    private final Production6_243 production = new Production6_243("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}