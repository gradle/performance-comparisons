package org.gradle.test.performancenull_35;

import static org.junit.Assert.*;

public class Testnull_3460 {
    private final Productionnull_3460 production = new Productionnull_3460("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}