package org.gradle.test.performance6_3;

import static org.junit.Assert.*;

public class Test6_238 {
    private final Production6_238 production = new Production6_238("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}