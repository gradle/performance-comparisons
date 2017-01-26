package org.gradle.test.performancenull_400;

import static org.junit.Assert.*;

public class Testnull_39947 {
    private final Productionnull_39947 production = new Productionnull_39947("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}