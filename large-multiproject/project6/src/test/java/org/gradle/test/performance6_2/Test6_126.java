package org.gradle.test.performance6_2;

import static org.junit.Assert.*;

public class Test6_126 {
    private final Production6_126 production = new Production6_126("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}