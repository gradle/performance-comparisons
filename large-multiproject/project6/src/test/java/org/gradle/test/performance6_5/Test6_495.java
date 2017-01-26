package org.gradle.test.performance6_5;

import static org.junit.Assert.*;

public class Test6_495 {
    private final Production6_495 production = new Production6_495("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}