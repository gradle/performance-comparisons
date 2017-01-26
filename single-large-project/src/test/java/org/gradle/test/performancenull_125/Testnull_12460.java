package org.gradle.test.performancenull_125;

import static org.junit.Assert.*;

public class Testnull_12460 {
    private final Productionnull_12460 production = new Productionnull_12460("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}