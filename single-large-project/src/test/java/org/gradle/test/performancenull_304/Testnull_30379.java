package org.gradle.test.performancenull_304;

import static org.junit.Assert.*;

public class Testnull_30379 {
    private final Productionnull_30379 production = new Productionnull_30379("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}