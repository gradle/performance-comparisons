package org.gradle.test.performancenull_433;

import static org.junit.Assert.*;

public class Testnull_43260 {
    private final Productionnull_43260 production = new Productionnull_43260("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}