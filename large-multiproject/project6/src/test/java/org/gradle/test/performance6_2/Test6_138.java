package org.gradle.test.performance6_2;

import static org.junit.Assert.*;

public class Test6_138 {
    private final Production6_138 production = new Production6_138("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}