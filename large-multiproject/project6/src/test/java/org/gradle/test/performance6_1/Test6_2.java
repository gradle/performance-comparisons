package org.gradle.test.performance6_1;

import static org.junit.Assert.*;

public class Test6_2 {
    private final Production6_2 production = new Production6_2("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}