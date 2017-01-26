package org.gradle.test.performance6_1;

import static org.junit.Assert.*;

public class Test6_72 {
    private final Production6_72 production = new Production6_72("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}