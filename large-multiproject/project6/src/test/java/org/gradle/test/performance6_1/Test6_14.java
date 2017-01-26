package org.gradle.test.performance6_1;

import static org.junit.Assert.*;

public class Test6_14 {
    private final Production6_14 production = new Production6_14("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}