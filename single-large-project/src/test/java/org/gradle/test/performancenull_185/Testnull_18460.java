package org.gradle.test.performancenull_185;

import static org.junit.Assert.*;

public class Testnull_18460 {
    private final Productionnull_18460 production = new Productionnull_18460("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}