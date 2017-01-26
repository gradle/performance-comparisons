package org.gradle.test.performancenull_60;

import static org.junit.Assert.*;

public class Testnull_5947 {
    private final Productionnull_5947 production = new Productionnull_5947("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}