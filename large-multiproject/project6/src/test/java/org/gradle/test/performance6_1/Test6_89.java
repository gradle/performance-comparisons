package org.gradle.test.performance6_1;

import static org.junit.Assert.*;

public class Test6_89 {
    private final Production6_89 production = new Production6_89("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}