package org.gradle.test.performancenull_173;

import static org.junit.Assert.*;

public class Testnull_17280 {
    private final Productionnull_17280 production = new Productionnull_17280("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}