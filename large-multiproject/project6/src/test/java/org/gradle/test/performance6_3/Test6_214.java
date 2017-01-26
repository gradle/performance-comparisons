package org.gradle.test.performance6_3;

import static org.junit.Assert.*;

public class Test6_214 {
    private final Production6_214 production = new Production6_214("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}