package org.gradle.test.performance6_3;

import static org.junit.Assert.*;

public class Test6_263 {
    private final Production6_263 production = new Production6_263("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}