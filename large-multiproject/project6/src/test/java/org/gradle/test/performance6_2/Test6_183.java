package org.gradle.test.performance6_2;

import static org.junit.Assert.*;

public class Test6_183 {
    private final Production6_183 production = new Production6_183("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}