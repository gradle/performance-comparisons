package org.gradle.test.performance6_3;

import static org.junit.Assert.*;

public class Test6_294 {
    private final Production6_294 production = new Production6_294("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}