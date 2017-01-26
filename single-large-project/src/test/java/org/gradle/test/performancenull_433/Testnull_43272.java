package org.gradle.test.performancenull_433;

import static org.junit.Assert.*;

public class Testnull_43272 {
    private final Productionnull_43272 production = new Productionnull_43272("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}