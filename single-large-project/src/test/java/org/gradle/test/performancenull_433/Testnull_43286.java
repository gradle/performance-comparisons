package org.gradle.test.performancenull_433;

import static org.junit.Assert.*;

public class Testnull_43286 {
    private final Productionnull_43286 production = new Productionnull_43286("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}