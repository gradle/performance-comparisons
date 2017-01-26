package org.gradle.test.performance6_1;

import static org.junit.Assert.*;

public class Test6_31 {
    private final Production6_31 production = new Production6_31("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}