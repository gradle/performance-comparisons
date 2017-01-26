package org.gradle.test.performance6_3;

import static org.junit.Assert.*;

public class Test6_237 {
    private final Production6_237 production = new Production6_237("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}