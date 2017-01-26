package org.gradle.test.performancenull_350;

import static org.junit.Assert.*;

public class Testnull_34947 {
    private final Productionnull_34947 production = new Productionnull_34947("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}