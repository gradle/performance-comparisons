package org.gradle.test.performancenull_433;

import static org.junit.Assert.*;

public class Testnull_43269 {
    private final Productionnull_43269 production = new Productionnull_43269("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}