package org.gradle.test.performancenull_311;

import static org.junit.Assert.*;

public class Testnull_31093 {
    private final Productionnull_31093 production = new Productionnull_31093("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}