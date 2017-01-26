package org.gradle.test.performancenull_25;

import static org.junit.Assert.*;

public class Testnull_2460 {
    private final Productionnull_2460 production = new Productionnull_2460("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}