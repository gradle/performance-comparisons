package org.gradle.test.performance6_1;

import static org.junit.Assert.*;

public class Test6_40 {
    private final Production6_40 production = new Production6_40("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}