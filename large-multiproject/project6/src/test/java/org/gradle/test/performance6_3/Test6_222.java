package org.gradle.test.performance6_3;

import static org.junit.Assert.*;

public class Test6_222 {
    private final Production6_222 production = new Production6_222("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}