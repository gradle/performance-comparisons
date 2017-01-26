package org.gradle.test.performance6_3;

import static org.junit.Assert.*;

public class Test6_228 {
    private final Production6_228 production = new Production6_228("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}