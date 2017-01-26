package org.gradle.test.performance6_2;

import static org.junit.Assert.*;

public class Test6_154 {
    private final Production6_154 production = new Production6_154("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}