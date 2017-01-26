package org.gradle.test.performancenull_380;

import static org.junit.Assert.*;

public class Testnull_37947 {
    private final Productionnull_37947 production = new Productionnull_37947("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}