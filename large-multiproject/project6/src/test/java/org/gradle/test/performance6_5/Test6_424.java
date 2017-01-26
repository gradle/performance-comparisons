package org.gradle.test.performance6_5;

import static org.junit.Assert.*;

public class Test6_424 {
    private final Production6_424 production = new Production6_424("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}