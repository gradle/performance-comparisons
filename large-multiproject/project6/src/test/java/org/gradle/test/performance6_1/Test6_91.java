package org.gradle.test.performance6_1;

import static org.junit.Assert.*;

public class Test6_91 {
    private final Production6_91 production = new Production6_91("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}