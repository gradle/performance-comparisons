package org.gradle.test.performance6_4;

import static org.junit.Assert.*;

public class Test6_392 {
    private final Production6_392 production = new Production6_392("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}