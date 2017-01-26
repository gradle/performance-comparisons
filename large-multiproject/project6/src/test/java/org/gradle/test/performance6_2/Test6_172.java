package org.gradle.test.performance6_2;

import static org.junit.Assert.*;

public class Test6_172 {
    private final Production6_172 production = new Production6_172("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}