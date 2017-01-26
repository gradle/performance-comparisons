package org.gradle.test.performancenull_256;

import static org.junit.Assert.*;

public class Testnull_25505 {
    private final Productionnull_25505 production = new Productionnull_25505("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}