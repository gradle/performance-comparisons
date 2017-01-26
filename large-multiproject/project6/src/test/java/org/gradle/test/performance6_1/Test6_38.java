package org.gradle.test.performance6_1;

import static org.junit.Assert.*;

public class Test6_38 {
    private final Production6_38 production = new Production6_38("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}