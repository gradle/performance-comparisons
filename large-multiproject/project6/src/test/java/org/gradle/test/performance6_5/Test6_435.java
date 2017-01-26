package org.gradle.test.performance6_5;

import static org.junit.Assert.*;

public class Test6_435 {
    private final Production6_435 production = new Production6_435("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}