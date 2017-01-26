package org.gradle.test.performance6_1;

import static org.junit.Assert.*;

public class Test6_17 {
    private final Production6_17 production = new Production6_17("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}