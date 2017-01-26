package org.gradle.test.performance6_4;

import static org.junit.Assert.*;

public class Test6_395 {
    private final Production6_395 production = new Production6_395("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}