package org.gradle.test.performancenull_154;

import static org.junit.Assert.*;

public class Testnull_15376 {
    private final Productionnull_15376 production = new Productionnull_15376("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}