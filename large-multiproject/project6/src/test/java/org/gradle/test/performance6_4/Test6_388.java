package org.gradle.test.performance6_4;

import static org.junit.Assert.*;

public class Test6_388 {
    private final Production6_388 production = new Production6_388("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}