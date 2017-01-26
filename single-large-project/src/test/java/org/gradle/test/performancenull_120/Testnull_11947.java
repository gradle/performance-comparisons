package org.gradle.test.performancenull_120;

import static org.junit.Assert.*;

public class Testnull_11947 {
    private final Productionnull_11947 production = new Productionnull_11947("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}