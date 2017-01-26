package org.gradle.test.performancenull_220;

import static org.junit.Assert.*;

public class Testnull_21909 {
    private final Productionnull_21909 production = new Productionnull_21909("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}