package org.gradle.test.performancenull_314;

import static org.junit.Assert.*;

public class Testnull_31379 {
    private final Productionnull_31379 production = new Productionnull_31379("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}