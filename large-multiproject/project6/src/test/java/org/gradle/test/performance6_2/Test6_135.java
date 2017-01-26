package org.gradle.test.performance6_2;

import static org.junit.Assert.*;

public class Test6_135 {
    private final Production6_135 production = new Production6_135("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}