package org.gradle.test.performancenull_433;

import static org.junit.Assert.*;

public class Testnull_43209 {
    private final Productionnull_43209 production = new Productionnull_43209("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}