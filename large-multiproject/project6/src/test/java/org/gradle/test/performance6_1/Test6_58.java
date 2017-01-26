package org.gradle.test.performance6_1;

import static org.junit.Assert.*;

public class Test6_58 {
    private final Production6_58 production = new Production6_58("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}