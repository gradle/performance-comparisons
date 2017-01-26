package org.gradle.test.performancenull_207;

import static org.junit.Assert.*;

public class Testnull_20630 {
    private final Productionnull_20630 production = new Productionnull_20630("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}