package org.gradle.test.performancenull_433;

import static org.junit.Assert.*;

public class Testnull_43240 {
    private final Productionnull_43240 production = new Productionnull_43240("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}