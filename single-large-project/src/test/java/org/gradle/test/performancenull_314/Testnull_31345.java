package org.gradle.test.performancenull_314;

import static org.junit.Assert.*;

public class Testnull_31345 {
    private final Productionnull_31345 production = new Productionnull_31345("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}