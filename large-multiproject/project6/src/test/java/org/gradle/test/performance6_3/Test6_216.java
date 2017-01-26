package org.gradle.test.performance6_3;

import static org.junit.Assert.*;

public class Test6_216 {
    private final Production6_216 production = new Production6_216("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}