package org.gradle.test.performancenull_190;

import static org.junit.Assert.*;

public class Testnull_18947 {
    private final Productionnull_18947 production = new Productionnull_18947("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}