package org.gradle.test.performancenull_433;

import static org.junit.Assert.*;

public class Testnull_43256 {
    private final Productionnull_43256 production = new Productionnull_43256("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}