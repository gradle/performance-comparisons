package org.gradle.test.performance6_5;

import static org.junit.Assert.*;

public class Test6_427 {
    private final Production6_427 production = new Production6_427("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}