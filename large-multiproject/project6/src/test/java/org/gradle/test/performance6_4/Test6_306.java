package org.gradle.test.performance6_4;

import static org.junit.Assert.*;

public class Test6_306 {
    private final Production6_306 production = new Production6_306("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}