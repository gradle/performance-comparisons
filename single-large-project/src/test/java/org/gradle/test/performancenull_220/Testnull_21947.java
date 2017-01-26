package org.gradle.test.performancenull_220;

import static org.junit.Assert.*;

public class Testnull_21947 {
    private final Productionnull_21947 production = new Productionnull_21947("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}