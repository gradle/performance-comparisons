package org.gradle.test.performance6_4;

import static org.junit.Assert.*;

public class Test6_358 {
    private final Production6_358 production = new Production6_358("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}