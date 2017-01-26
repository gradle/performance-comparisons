package org.gradle.test.performance6_4;

import static org.junit.Assert.*;

public class Test6_350 {
    private final Production6_350 production = new Production6_350("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}