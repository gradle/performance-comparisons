package org.gradle.test.performancenull_385;

import static org.junit.Assert.*;

public class Testnull_38460 {
    private final Productionnull_38460 production = new Productionnull_38460("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}