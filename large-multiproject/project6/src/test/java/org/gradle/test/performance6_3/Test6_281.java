package org.gradle.test.performance6_3;

import static org.junit.Assert.*;

public class Test6_281 {
    private final Production6_281 production = new Production6_281("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}