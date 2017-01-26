package org.gradle.test.performance6_1;

import static org.junit.Assert.*;

public class Test6_67 {
    private final Production6_67 production = new Production6_67("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}