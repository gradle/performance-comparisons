package org.gradle.test.performance6_1;

import static org.junit.Assert.*;

public class Test6_93 {
    private final Production6_93 production = new Production6_93("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}