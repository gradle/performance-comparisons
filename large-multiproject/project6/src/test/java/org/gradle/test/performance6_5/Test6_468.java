package org.gradle.test.performance6_5;

import static org.junit.Assert.*;

public class Test6_468 {
    private final Production6_468 production = new Production6_468("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}