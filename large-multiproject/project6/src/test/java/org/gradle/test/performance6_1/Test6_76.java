package org.gradle.test.performance6_1;

import static org.junit.Assert.*;

public class Test6_76 {
    private final Production6_76 production = new Production6_76("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}