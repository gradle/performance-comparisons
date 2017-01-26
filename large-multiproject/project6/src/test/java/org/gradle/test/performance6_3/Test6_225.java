package org.gradle.test.performance6_3;

import static org.junit.Assert.*;

public class Test6_225 {
    private final Production6_225 production = new Production6_225("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}