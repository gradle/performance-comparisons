package org.gradle.test.performance6_4;

import static org.junit.Assert.*;

public class Test6_305 {
    private final Production6_305 production = new Production6_305("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}