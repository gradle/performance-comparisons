package org.gradle.test.performance6_1;

import static org.junit.Assert.*;

public class Test6_43 {
    private final Production6_43 production = new Production6_43("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}