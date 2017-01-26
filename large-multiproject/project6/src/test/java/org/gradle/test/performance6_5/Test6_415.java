package org.gradle.test.performance6_5;

import static org.junit.Assert.*;

public class Test6_415 {
    private final Production6_415 production = new Production6_415("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}