package org.gradle.test.performance6_2;

import static org.junit.Assert.*;

public class Test6_107 {
    private final Production6_107 production = new Production6_107("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}