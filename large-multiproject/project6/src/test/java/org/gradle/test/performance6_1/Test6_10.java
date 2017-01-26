package org.gradle.test.performance6_1;

import static org.junit.Assert.*;

public class Test6_10 {
    private final Production6_10 production = new Production6_10("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}