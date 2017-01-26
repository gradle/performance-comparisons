package org.gradle.test.performance6_5;

import static org.junit.Assert.*;

public class Test6_461 {
    private final Production6_461 production = new Production6_461("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}