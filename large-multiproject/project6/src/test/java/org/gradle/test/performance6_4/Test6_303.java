package org.gradle.test.performance6_4;

import static org.junit.Assert.*;

public class Test6_303 {
    private final Production6_303 production = new Production6_303("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}