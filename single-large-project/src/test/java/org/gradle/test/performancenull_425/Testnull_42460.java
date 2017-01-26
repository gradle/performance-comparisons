package org.gradle.test.performancenull_425;

import static org.junit.Assert.*;

public class Testnull_42460 {
    private final Productionnull_42460 production = new Productionnull_42460("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}