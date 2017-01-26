package org.gradle.test.performancenull_175;

import static org.junit.Assert.*;

public class Testnull_17460 {
    private final Productionnull_17460 production = new Productionnull_17460("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}