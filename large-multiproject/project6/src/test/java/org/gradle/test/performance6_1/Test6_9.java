package org.gradle.test.performance6_1;

import static org.junit.Assert.*;

public class Test6_9 {
    private final Production6_9 production = new Production6_9("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}