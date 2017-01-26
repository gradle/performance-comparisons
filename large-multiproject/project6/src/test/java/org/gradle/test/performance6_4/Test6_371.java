package org.gradle.test.performance6_4;

import static org.junit.Assert.*;

public class Test6_371 {
    private final Production6_371 production = new Production6_371("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}