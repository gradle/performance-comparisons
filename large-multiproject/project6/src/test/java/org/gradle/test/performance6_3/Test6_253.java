package org.gradle.test.performance6_3;

import static org.junit.Assert.*;

public class Test6_253 {
    private final Production6_253 production = new Production6_253("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}