package org.gradle.test.performance6_3;

import static org.junit.Assert.*;

public class Test6_209 {
    private final Production6_209 production = new Production6_209("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}