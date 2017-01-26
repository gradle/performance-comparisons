package org.gradle.test.performancenull_141;

import static org.junit.Assert.*;

public class Testnull_14076 {
    private final Productionnull_14076 production = new Productionnull_14076("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}