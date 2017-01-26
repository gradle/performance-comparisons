package org.gradle.test.performancenull_360;

import static org.junit.Assert.*;

public class Testnull_35947 {
    private final Productionnull_35947 production = new Productionnull_35947("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}