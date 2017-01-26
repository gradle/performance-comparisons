package org.gradle.test.performance6_5;

import static org.junit.Assert.*;

public class Test6_457 {
    private final Production6_457 production = new Production6_457("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}