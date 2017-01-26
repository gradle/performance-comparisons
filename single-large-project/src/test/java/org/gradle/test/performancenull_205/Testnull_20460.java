package org.gradle.test.performancenull_205;

import static org.junit.Assert.*;

public class Testnull_20460 {
    private final Productionnull_20460 production = new Productionnull_20460("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}