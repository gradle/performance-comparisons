package org.gradle.test.performance6_2;

import static org.junit.Assert.*;

public class Test6_195 {
    private final Production6_195 production = new Production6_195("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}