package org.gradle.test.performance6_5;

import static org.junit.Assert.*;

public class Test6_497 {
    private final Production6_497 production = new Production6_497("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}