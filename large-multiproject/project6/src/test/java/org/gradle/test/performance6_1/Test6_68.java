package org.gradle.test.performance6_1;

import static org.junit.Assert.*;

public class Test6_68 {
    private final Production6_68 production = new Production6_68("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}