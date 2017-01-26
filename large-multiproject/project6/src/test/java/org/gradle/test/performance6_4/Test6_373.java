package org.gradle.test.performance6_4;

import static org.junit.Assert.*;

public class Test6_373 {
    private final Production6_373 production = new Production6_373("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}