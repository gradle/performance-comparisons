package org.gradle.test.performancenull_330;

import static org.junit.Assert.*;

public class Testnull_32954 {
    private final Productionnull_32954 production = new Productionnull_32954("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}