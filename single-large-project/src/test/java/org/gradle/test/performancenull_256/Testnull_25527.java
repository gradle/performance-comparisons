package org.gradle.test.performancenull_256;

import static org.junit.Assert.*;

public class Testnull_25527 {
    private final Productionnull_25527 production = new Productionnull_25527("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}