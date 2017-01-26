package org.gradle.test.performancenull_314;

import static org.junit.Assert.*;

public class Testnull_31370 {
    private final Productionnull_31370 production = new Productionnull_31370("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}