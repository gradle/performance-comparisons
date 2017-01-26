package org.gradle.test.performance6_2;

import static org.junit.Assert.*;

public class Test6_155 {
    private final Production6_155 production = new Production6_155("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}