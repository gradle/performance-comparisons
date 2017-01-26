package org.gradle.test.performancenull_485;

import static org.junit.Assert.*;

public class Testnull_48460 {
    private final Productionnull_48460 production = new Productionnull_48460("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}