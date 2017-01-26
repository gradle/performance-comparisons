package org.gradle.test.performance6_3;

import static org.junit.Assert.*;

public class Test6_215 {
    private final Production6_215 production = new Production6_215("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}