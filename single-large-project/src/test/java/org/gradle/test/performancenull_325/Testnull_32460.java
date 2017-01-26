package org.gradle.test.performancenull_325;

import static org.junit.Assert.*;

public class Testnull_32460 {
    private final Productionnull_32460 production = new Productionnull_32460("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}