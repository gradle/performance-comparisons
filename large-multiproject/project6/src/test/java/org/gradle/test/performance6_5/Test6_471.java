package org.gradle.test.performance6_5;

import static org.junit.Assert.*;

public class Test6_471 {
    private final Production6_471 production = new Production6_471("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}