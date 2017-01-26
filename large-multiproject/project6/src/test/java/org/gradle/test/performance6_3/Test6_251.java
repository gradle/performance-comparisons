package org.gradle.test.performance6_3;

import static org.junit.Assert.*;

public class Test6_251 {
    private final Production6_251 production = new Production6_251("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}