package org.gradle.test.performancenull_314;

import static org.junit.Assert.*;

public class Testnull_31380 {
    private final Productionnull_31380 production = new Productionnull_31380("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}