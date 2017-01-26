package org.gradle.test.performance6_5;

import static org.junit.Assert.*;

public class Test6_432 {
    private final Production6_432 production = new Production6_432("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}