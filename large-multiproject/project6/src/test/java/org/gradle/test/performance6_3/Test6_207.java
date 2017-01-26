package org.gradle.test.performance6_3;

import static org.junit.Assert.*;

public class Test6_207 {
    private final Production6_207 production = new Production6_207("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}