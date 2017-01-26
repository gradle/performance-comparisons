package org.gradle.test.performance6_1;

import static org.junit.Assert.*;

public class Test6_71 {
    private final Production6_71 production = new Production6_71("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}