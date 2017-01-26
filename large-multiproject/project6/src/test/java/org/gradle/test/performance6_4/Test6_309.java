package org.gradle.test.performance6_4;

import static org.junit.Assert.*;

public class Test6_309 {
    private final Production6_309 production = new Production6_309("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}