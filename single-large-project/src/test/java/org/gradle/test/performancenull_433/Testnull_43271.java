package org.gradle.test.performancenull_433;

import static org.junit.Assert.*;

public class Testnull_43271 {
    private final Productionnull_43271 production = new Productionnull_43271("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}