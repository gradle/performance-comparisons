package org.gradle.test.performance6_5;

import static org.junit.Assert.*;

public class Test6_475 {
    private final Production6_475 production = new Production6_475("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}