package org.gradle.test.performancenull_314;

import static org.junit.Assert.*;

public class Testnull_31398 {
    private final Productionnull_31398 production = new Productionnull_31398("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}