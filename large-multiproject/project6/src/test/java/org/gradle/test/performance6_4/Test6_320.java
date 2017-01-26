package org.gradle.test.performance6_4;

import static org.junit.Assert.*;

public class Test6_320 {
    private final Production6_320 production = new Production6_320("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}