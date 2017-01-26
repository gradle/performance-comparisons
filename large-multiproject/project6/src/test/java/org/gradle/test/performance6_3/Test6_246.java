package org.gradle.test.performance6_3;

import static org.junit.Assert.*;

public class Test6_246 {
    private final Production6_246 production = new Production6_246("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}