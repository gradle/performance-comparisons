package org.gradle.test.performance6_3;

import static org.junit.Assert.*;

public class Test6_267 {
    private final Production6_267 production = new Production6_267("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}