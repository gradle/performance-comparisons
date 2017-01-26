package org.gradle.test.performance6_2;

import static org.junit.Assert.*;

public class Test6_171 {
    private final Production6_171 production = new Production6_171("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}