package org.gradle.test.performance6_2;

import static org.junit.Assert.*;

public class Test6_188 {
    private final Production6_188 production = new Production6_188("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}