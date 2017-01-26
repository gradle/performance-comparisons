package org.gradle.test.performance6_1;

import static org.junit.Assert.*;

public class Test6_39 {
    private final Production6_39 production = new Production6_39("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}