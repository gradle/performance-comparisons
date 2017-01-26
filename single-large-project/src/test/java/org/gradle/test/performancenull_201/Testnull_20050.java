package org.gradle.test.performancenull_201;

import static org.junit.Assert.*;

public class Testnull_20050 {
    private final Productionnull_20050 production = new Productionnull_20050("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}