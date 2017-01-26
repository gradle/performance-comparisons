package org.gradle.test.performance6_3;

import static org.junit.Assert.*;

public class Test6_202 {
    private final Production6_202 production = new Production6_202("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}