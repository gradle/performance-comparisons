package org.gradle.test.performance6_2;

import static org.junit.Assert.*;

public class Test6_134 {
    private final Production6_134 production = new Production6_134("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}