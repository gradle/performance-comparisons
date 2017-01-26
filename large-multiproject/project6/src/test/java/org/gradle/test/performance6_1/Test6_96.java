package org.gradle.test.performance6_1;

import static org.junit.Assert.*;

public class Test6_96 {
    private final Production6_96 production = new Production6_96("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}