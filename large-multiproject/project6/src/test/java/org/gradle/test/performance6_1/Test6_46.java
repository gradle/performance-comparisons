package org.gradle.test.performance6_1;

import static org.junit.Assert.*;

public class Test6_46 {
    private final Production6_46 production = new Production6_46("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}