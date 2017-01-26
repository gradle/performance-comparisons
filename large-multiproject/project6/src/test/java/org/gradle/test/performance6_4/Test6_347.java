package org.gradle.test.performance6_4;

import static org.junit.Assert.*;

public class Test6_347 {
    private final Production6_347 production = new Production6_347("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}