package org.gradle.test.performance6_5;

import static org.junit.Assert.*;

public class Test6_488 {
    private final Production6_488 production = new Production6_488("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}