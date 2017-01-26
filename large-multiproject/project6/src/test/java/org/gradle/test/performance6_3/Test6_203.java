package org.gradle.test.performance6_3;

import static org.junit.Assert.*;

public class Test6_203 {
    private final Production6_203 production = new Production6_203("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}