package org.gradle.test.performancenull_15;

import static org.junit.Assert.*;

public class Testnull_1460 {
    private final Productionnull_1460 production = new Productionnull_1460("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}