package org.gradle.test.performance6_1;

import static org.junit.Assert.*;

public class Test6_42 {
    private final Production6_42 production = new Production6_42("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}