package org.gradle.test.performance6_2;

import static org.junit.Assert.*;

public class Test6_181 {
    private final Production6_181 production = new Production6_181("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}