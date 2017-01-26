package org.gradle.test.performance6_1;

import static org.junit.Assert.*;

public class Test6_100 {
    private final Production6_100 production = new Production6_100("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}