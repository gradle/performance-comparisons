package org.gradle.test.performance6_3;

import static org.junit.Assert.*;

public class Test6_231 {
    private final Production6_231 production = new Production6_231("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}