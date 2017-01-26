package org.gradle.test.performance6_4;

import static org.junit.Assert.*;

public class Test6_322 {
    private final Production6_322 production = new Production6_322("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}