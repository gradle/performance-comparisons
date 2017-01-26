package org.gradle.test.performance6_5;

import static org.junit.Assert.*;

public class Test6_422 {
    private final Production6_422 production = new Production6_422("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}