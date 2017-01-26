package org.gradle.test.performance6_4;

import static org.junit.Assert.*;

public class Test6_338 {
    private final Production6_338 production = new Production6_338("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}