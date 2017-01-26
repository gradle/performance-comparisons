package org.gradle.test.performance6_5;

import static org.junit.Assert.*;

public class Test6_465 {
    private final Production6_465 production = new Production6_465("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}