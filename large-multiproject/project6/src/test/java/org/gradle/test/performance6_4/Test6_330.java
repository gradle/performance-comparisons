package org.gradle.test.performance6_4;

import static org.junit.Assert.*;

public class Test6_330 {
    private final Production6_330 production = new Production6_330("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}