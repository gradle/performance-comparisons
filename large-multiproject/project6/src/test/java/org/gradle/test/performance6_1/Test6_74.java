package org.gradle.test.performance6_1;

import static org.junit.Assert.*;

public class Test6_74 {
    private final Production6_74 production = new Production6_74("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}