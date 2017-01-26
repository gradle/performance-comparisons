package org.gradle.test.performancenull_433;

import static org.junit.Assert.*;

public class Testnull_43227 {
    private final Productionnull_43227 production = new Productionnull_43227("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}