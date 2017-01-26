package org.gradle.test.performance6_3;

import static org.junit.Assert.*;

public class Test6_297 {
    private final Production6_297 production = new Production6_297("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}