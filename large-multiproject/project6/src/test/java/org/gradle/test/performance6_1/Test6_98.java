package org.gradle.test.performance6_1;

import static org.junit.Assert.*;

public class Test6_98 {
    private final Production6_98 production = new Production6_98("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}