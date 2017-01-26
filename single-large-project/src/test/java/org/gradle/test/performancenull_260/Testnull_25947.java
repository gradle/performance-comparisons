package org.gradle.test.performancenull_260;

import static org.junit.Assert.*;

public class Testnull_25947 {
    private final Productionnull_25947 production = new Productionnull_25947("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}