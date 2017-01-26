package org.gradle.test.performance6_1;

import static org.junit.Assert.*;

public class Test6_99 {
    private final Production6_99 production = new Production6_99("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}