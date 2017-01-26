package org.gradle.test.performance6_2;

import static org.junit.Assert.*;

public class Test6_186 {
    private final Production6_186 production = new Production6_186("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}