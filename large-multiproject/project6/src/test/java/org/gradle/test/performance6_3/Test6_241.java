package org.gradle.test.performance6_3;

import static org.junit.Assert.*;

public class Test6_241 {
    private final Production6_241 production = new Production6_241("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}