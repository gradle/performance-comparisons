package org.gradle.test.performance6_5;

import static org.junit.Assert.*;

public class Test6_445 {
    private final Production6_445 production = new Production6_445("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}