package org.gradle.test.performance6_2;

import static org.junit.Assert.*;

public class Test6_145 {
    private final Production6_145 production = new Production6_145("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}