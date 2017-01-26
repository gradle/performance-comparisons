package org.gradle.test.performance6_2;

import static org.junit.Assert.*;

public class Test6_119 {
    private final Production6_119 production = new Production6_119("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}