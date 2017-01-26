package org.gradle.test.performancenull_430;

import static org.junit.Assert.*;

public class Testnull_42947 {
    private final Productionnull_42947 production = new Productionnull_42947("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}