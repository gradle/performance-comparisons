package org.gradle.test.performancenull_100;

import static org.junit.Assert.*;

public class Testnull_9947 {
    private final Productionnull_9947 production = new Productionnull_9947("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}