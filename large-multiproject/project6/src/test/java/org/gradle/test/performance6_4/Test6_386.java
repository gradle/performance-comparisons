package org.gradle.test.performance6_4;

import static org.junit.Assert.*;

public class Test6_386 {
    private final Production6_386 production = new Production6_386("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}