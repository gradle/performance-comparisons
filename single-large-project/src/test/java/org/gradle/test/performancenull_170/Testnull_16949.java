package org.gradle.test.performancenull_170;

import static org.junit.Assert.*;

public class Testnull_16949 {
    private final Productionnull_16949 production = new Productionnull_16949("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}