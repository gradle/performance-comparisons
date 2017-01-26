package org.gradle.test.performance6_5;

import static org.junit.Assert.*;

public class Test6_474 {
    private final Production6_474 production = new Production6_474("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}