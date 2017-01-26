package org.gradle.test.performance6_5;

import static org.junit.Assert.*;

public class Test6_437 {
    private final Production6_437 production = new Production6_437("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}