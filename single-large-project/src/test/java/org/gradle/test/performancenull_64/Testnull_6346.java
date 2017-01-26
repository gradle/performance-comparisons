package org.gradle.test.performancenull_64;

import static org.junit.Assert.*;

public class Testnull_6346 {
    private final Productionnull_6346 production = new Productionnull_6346("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}