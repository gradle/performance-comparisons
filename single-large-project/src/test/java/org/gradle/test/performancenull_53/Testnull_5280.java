package org.gradle.test.performancenull_53;

import static org.junit.Assert.*;

public class Testnull_5280 {
    private final Productionnull_5280 production = new Productionnull_5280("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}