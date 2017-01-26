package org.gradle.test.performancenull_215;

import static org.junit.Assert.*;

public class Testnull_21460 {
    private final Productionnull_21460 production = new Productionnull_21460("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}