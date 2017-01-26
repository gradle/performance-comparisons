package org.gradle.test.performance6_1;

import static org.junit.Assert.*;

public class Test6_44 {
    private final Production6_44 production = new Production6_44("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}