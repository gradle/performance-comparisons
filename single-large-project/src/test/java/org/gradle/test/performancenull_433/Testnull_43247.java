package org.gradle.test.performancenull_433;

import static org.junit.Assert.*;

public class Testnull_43247 {
    private final Productionnull_43247 production = new Productionnull_43247("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}