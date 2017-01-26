package org.gradle.test.performancenull_320;

import static org.junit.Assert.*;

public class Testnull_31947 {
    private final Productionnull_31947 production = new Productionnull_31947("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}