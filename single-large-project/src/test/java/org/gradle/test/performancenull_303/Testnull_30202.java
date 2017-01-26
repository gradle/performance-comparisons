package org.gradle.test.performancenull_303;

import static org.junit.Assert.*;

public class Testnull_30202 {
    private final Productionnull_30202 production = new Productionnull_30202("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}