package org.gradle.test.performance6_4;

import static org.junit.Assert.*;

public class Test6_362 {
    private final Production6_362 production = new Production6_362("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}