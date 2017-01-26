package org.gradle.test.performance6_4;

import static org.junit.Assert.*;

public class Test6_325 {
    private final Production6_325 production = new Production6_325("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}