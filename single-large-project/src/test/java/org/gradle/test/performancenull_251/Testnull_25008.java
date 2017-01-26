package org.gradle.test.performancenull_251;

import static org.junit.Assert.*;

public class Testnull_25008 {
    private final Productionnull_25008 production = new Productionnull_25008("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}