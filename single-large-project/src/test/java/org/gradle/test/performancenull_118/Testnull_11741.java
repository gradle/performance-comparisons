package org.gradle.test.performancenull_118;

import static org.junit.Assert.*;

public class Testnull_11741 {
    private final Productionnull_11741 production = new Productionnull_11741("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}