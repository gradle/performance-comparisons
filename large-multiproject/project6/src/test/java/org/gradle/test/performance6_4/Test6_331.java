package org.gradle.test.performance6_4;

import static org.junit.Assert.*;

public class Test6_331 {
    private final Production6_331 production = new Production6_331("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}