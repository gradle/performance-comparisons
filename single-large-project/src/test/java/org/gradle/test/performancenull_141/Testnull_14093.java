package org.gradle.test.performancenull_141;

import static org.junit.Assert.*;

public class Testnull_14093 {
    private final Productionnull_14093 production = new Productionnull_14093("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}