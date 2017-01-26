package org.gradle.test.performancenull_435;

import static org.junit.Assert.*;

public class Testnull_43460 {
    private final Productionnull_43460 production = new Productionnull_43460("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}