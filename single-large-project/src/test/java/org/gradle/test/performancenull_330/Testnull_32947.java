package org.gradle.test.performancenull_330;

import static org.junit.Assert.*;

public class Testnull_32947 {
    private final Productionnull_32947 production = new Productionnull_32947("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}