package org.gradle.test.performancenull_235;

import static org.junit.Assert.*;

public class Testnull_23460 {
    private final Productionnull_23460 production = new Productionnull_23460("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}