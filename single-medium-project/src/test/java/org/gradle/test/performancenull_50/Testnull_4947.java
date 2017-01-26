package org.gradle.test.performancenull_50;

import static org.junit.Assert.*;

public class Testnull_4947 {
    private final Productionnull_4947 production = new Productionnull_4947("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}