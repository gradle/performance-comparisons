package org.gradle.test.performance6_2;

import static org.junit.Assert.*;

public class Test6_199 {
    private final Production6_199 production = new Production6_199("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}