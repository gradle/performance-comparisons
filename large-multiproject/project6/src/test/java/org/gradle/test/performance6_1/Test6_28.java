package org.gradle.test.performance6_1;

import static org.junit.Assert.*;

public class Test6_28 {
    private final Production6_28 production = new Production6_28("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}