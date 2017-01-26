package org.gradle.test.performancenull_211;

import static org.junit.Assert.*;

public class Testnull_21083 {
    private final Productionnull_21083 production = new Productionnull_21083("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}