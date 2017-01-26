package org.gradle.test.performancenull_204;

import static org.junit.Assert.*;

public class Testnull_20346 {
    private final Productionnull_20346 production = new Productionnull_20346("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}