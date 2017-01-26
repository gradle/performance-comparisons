package org.gradle.test.performancenull_75;

import static org.junit.Assert.*;

public class Testnull_7460 {
    private final Productionnull_7460 production = new Productionnull_7460("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}