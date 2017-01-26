package org.gradle.test.performancenull_40;

import static org.junit.Assert.*;

public class Testnull_3947 {
    private final Productionnull_3947 production = new Productionnull_3947("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}