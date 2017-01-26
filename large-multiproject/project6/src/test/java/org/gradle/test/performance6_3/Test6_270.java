package org.gradle.test.performance6_3;

import static org.junit.Assert.*;

public class Test6_270 {
    private final Production6_270 production = new Production6_270("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}