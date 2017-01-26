package org.gradle.test.performance6_2;

import static org.junit.Assert.*;

public class Test6_157 {
    private final Production6_157 production = new Production6_157("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}