package org.gradle.test.performancenull_345;

import static org.junit.Assert.*;

public class Testnull_34460 {
    private final Productionnull_34460 production = new Productionnull_34460("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}