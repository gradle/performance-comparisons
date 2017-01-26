package org.gradle.test.performance6_5;

import static org.junit.Assert.*;

public class Test6_476 {
    private final Production6_476 production = new Production6_476("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}