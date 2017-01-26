package org.gradle.test.performancenull_101;

import static org.junit.Assert.*;

public class Testnull_10070 {
    private final Productionnull_10070 production = new Productionnull_10070("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}