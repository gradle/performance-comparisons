package org.gradle.test.performance6_3;

import static org.junit.Assert.*;

public class Test6_229 {
    private final Production6_229 production = new Production6_229("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}