package org.gradle.test.performance6_4;

import static org.junit.Assert.*;

public class Test6_323 {
    private final Production6_323 production = new Production6_323("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}