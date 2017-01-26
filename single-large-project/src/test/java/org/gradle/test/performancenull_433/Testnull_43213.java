package org.gradle.test.performancenull_433;

import static org.junit.Assert.*;

public class Testnull_43213 {
    private final Productionnull_43213 production = new Productionnull_43213("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}