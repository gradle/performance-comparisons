package org.gradle.test.performancenull_130;

import static org.junit.Assert.*;

public class Testnull_12947 {
    private final Productionnull_12947 production = new Productionnull_12947("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}