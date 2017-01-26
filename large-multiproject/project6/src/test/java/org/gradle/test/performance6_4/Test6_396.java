package org.gradle.test.performance6_4;

import static org.junit.Assert.*;

public class Test6_396 {
    private final Production6_396 production = new Production6_396("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}