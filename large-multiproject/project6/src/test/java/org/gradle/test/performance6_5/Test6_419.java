package org.gradle.test.performance6_5;

import static org.junit.Assert.*;

public class Test6_419 {
    private final Production6_419 production = new Production6_419("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}