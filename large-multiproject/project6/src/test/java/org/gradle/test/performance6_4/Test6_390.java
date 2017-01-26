package org.gradle.test.performance6_4;

import static org.junit.Assert.*;

public class Test6_390 {
    private final Production6_390 production = new Production6_390("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}