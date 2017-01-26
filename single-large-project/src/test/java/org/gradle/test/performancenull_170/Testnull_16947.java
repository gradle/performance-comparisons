package org.gradle.test.performancenull_170;

import static org.junit.Assert.*;

public class Testnull_16947 {
    private final Productionnull_16947 production = new Productionnull_16947("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}