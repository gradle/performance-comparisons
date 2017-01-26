package org.gradle.test.performancenull_433;

import static org.junit.Assert.*;

public class Testnull_43285 {
    private final Productionnull_43285 production = new Productionnull_43285("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}