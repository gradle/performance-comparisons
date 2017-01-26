package org.gradle.test.performancenull_365;

import static org.junit.Assert.*;

public class Testnull_36460 {
    private final Productionnull_36460 production = new Productionnull_36460("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}