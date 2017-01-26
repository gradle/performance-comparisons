package org.gradle.test.performance6_3;

import static org.junit.Assert.*;

public class Test6_268 {
    private final Production6_268 production = new Production6_268("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}