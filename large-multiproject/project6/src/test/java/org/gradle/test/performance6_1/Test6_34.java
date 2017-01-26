package org.gradle.test.performance6_1;

import static org.junit.Assert.*;

public class Test6_34 {
    private final Production6_34 production = new Production6_34("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}