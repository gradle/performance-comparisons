package org.gradle.test.performance6_2;

import static org.junit.Assert.*;

public class Test6_162 {
    private final Production6_162 production = new Production6_162("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}