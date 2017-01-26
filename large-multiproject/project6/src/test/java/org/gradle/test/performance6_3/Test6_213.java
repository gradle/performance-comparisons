package org.gradle.test.performance6_3;

import static org.junit.Assert.*;

public class Test6_213 {
    private final Production6_213 production = new Production6_213("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}