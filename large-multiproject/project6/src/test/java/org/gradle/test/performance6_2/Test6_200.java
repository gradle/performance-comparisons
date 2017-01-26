package org.gradle.test.performance6_2;

import static org.junit.Assert.*;

public class Test6_200 {
    private final Production6_200 production = new Production6_200("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}