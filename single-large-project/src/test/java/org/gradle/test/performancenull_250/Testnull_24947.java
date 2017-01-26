package org.gradle.test.performancenull_250;

import static org.junit.Assert.*;

public class Testnull_24947 {
    private final Productionnull_24947 production = new Productionnull_24947("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}