package org.gradle.test.performance6_4;

import static org.junit.Assert.*;

public class Test6_360 {
    private final Production6_360 production = new Production6_360("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}