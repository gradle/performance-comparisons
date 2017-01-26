package org.gradle.test.performance6_3;

import static org.junit.Assert.*;

public class Test6_288 {
    private final Production6_288 production = new Production6_288("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}