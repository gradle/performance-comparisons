package org.gradle.test.performance6_4;

import static org.junit.Assert.*;

public class Test6_356 {
    private final Production6_356 production = new Production6_356("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}