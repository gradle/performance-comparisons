package org.gradle.test.performancenull_303;

import static org.junit.Assert.*;

public class Testnull_30280 {
    private final Productionnull_30280 production = new Productionnull_30280("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}