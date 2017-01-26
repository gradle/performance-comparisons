package org.gradle.test.performance6_2;

import static org.junit.Assert.*;

public class Test6_166 {
    private final Production6_166 production = new Production6_166("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}