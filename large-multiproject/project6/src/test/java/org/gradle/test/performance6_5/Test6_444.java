package org.gradle.test.performance6_5;

import static org.junit.Assert.*;

public class Test6_444 {
    private final Production6_444 production = new Production6_444("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}