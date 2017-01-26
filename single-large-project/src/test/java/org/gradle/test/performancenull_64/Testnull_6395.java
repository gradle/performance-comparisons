package org.gradle.test.performancenull_64;

import static org.junit.Assert.*;

public class Testnull_6395 {
    private final Productionnull_6395 production = new Productionnull_6395("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}