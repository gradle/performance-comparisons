package org.gradle.test.performance6_5;

import static org.junit.Assert.*;

public class Test6_458 {
    private final Production6_458 production = new Production6_458("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}