package org.gradle.test.performance6_3;

import static org.junit.Assert.*;

public class Test6_286 {
    private final Production6_286 production = new Production6_286("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}