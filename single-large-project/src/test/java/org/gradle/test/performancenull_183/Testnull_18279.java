package org.gradle.test.performancenull_183;

import static org.junit.Assert.*;

public class Testnull_18279 {
    private final Productionnull_18279 production = new Productionnull_18279("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}