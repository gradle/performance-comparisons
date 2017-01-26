package org.gradle.test.performance6_1;

import static org.junit.Assert.*;

public class Test6_78 {
    private final Production6_78 production = new Production6_78("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}