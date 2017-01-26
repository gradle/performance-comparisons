package org.gradle.test.performancenull_204;

import static org.junit.Assert.*;

public class Testnull_20328 {
    private final Productionnull_20328 production = new Productionnull_20328("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}