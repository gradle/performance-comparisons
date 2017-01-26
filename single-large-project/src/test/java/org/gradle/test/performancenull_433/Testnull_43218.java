package org.gradle.test.performancenull_433;

import static org.junit.Assert.*;

public class Testnull_43218 {
    private final Productionnull_43218 production = new Productionnull_43218("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}