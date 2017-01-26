package org.gradle.test.performancenull_23;

import static org.junit.Assert.*;

public class Testnull_2280 {
    private final Productionnull_2280 production = new Productionnull_2280("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}