package org.gradle.test.performancenull_261;

import static org.junit.Assert.*;

public class Testnull_26093 {
    private final Productionnull_26093 production = new Productionnull_26093("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}