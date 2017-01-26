package org.gradle.test.performancenull_200;

import static org.junit.Assert.*;

public class Testnull_19947 {
    private final Productionnull_19947 production = new Productionnull_19947("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}