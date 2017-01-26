package org.gradle.test.performance6_3;

import static org.junit.Assert.*;

public class Test6_264 {
    private final Production6_264 production = new Production6_264("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}