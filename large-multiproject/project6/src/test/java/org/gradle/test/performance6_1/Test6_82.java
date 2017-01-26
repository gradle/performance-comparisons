package org.gradle.test.performance6_1;

import static org.junit.Assert.*;

public class Test6_82 {
    private final Production6_82 production = new Production6_82("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}