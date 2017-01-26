package org.gradle.test.performancenull_363;

import static org.junit.Assert.*;

public class Testnull_36280 {
    private final Productionnull_36280 production = new Productionnull_36280("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}