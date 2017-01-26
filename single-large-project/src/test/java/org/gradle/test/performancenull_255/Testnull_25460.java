package org.gradle.test.performancenull_255;

import static org.junit.Assert.*;

public class Testnull_25460 {
    private final Productionnull_25460 production = new Productionnull_25460("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}