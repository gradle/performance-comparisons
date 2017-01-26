package org.gradle.test.performance6_1;

import static org.junit.Assert.*;

public class Test6_75 {
    private final Production6_75 production = new Production6_75("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}