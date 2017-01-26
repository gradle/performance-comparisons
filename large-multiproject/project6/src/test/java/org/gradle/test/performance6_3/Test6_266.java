package org.gradle.test.performance6_3;

import static org.junit.Assert.*;

public class Test6_266 {
    private final Production6_266 production = new Production6_266("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}