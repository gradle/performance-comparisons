package org.gradle.test.performance6_4;

import static org.junit.Assert.*;

public class Test6_337 {
    private final Production6_337 production = new Production6_337("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}