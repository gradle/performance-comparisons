package org.gradle.test.performancenull_53;

import static org.junit.Assert.*;

public class Testnull_5292 {
    private final Productionnull_5292 production = new Productionnull_5292("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}