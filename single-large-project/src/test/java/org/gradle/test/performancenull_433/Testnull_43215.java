package org.gradle.test.performancenull_433;

import static org.junit.Assert.*;

public class Testnull_43215 {
    private final Productionnull_43215 production = new Productionnull_43215("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}