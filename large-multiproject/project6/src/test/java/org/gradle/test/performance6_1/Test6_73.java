package org.gradle.test.performance6_1;

import static org.junit.Assert.*;

public class Test6_73 {
    private final Production6_73 production = new Production6_73("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}