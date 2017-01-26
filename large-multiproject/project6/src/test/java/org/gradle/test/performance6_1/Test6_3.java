package org.gradle.test.performance6_1;

import static org.junit.Assert.*;

public class Test6_3 {
    private final Production6_3 production = new Production6_3("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}