package org.gradle.test.performancenull_415;

import static org.junit.Assert.*;

public class Testnull_41460 {
    private final Productionnull_41460 production = new Productionnull_41460("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}