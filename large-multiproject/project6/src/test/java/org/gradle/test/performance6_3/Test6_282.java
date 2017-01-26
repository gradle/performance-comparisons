package org.gradle.test.performance6_3;

import static org.junit.Assert.*;

public class Test6_282 {
    private final Production6_282 production = new Production6_282("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}