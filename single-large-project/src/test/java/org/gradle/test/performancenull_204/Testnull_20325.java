package org.gradle.test.performancenull_204;

import static org.junit.Assert.*;

public class Testnull_20325 {
    private final Productionnull_20325 production = new Productionnull_20325("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}