package org.gradle.test.performancenull_45;

import static org.junit.Assert.*;

public class Testnull_4460 {
    private final Productionnull_4460 production = new Productionnull_4460("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}