package org.gradle.test.performancenull_207;

import static org.junit.Assert.*;

public class Testnull_20646 {
    private final Productionnull_20646 production = new Productionnull_20646("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}