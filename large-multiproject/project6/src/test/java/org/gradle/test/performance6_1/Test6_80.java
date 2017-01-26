package org.gradle.test.performance6_1;

import static org.junit.Assert.*;

public class Test6_80 {
    private final Production6_80 production = new Production6_80("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}