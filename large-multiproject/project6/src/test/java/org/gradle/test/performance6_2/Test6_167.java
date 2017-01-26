package org.gradle.test.performance6_2;

import static org.junit.Assert.*;

public class Test6_167 {
    private final Production6_167 production = new Production6_167("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}