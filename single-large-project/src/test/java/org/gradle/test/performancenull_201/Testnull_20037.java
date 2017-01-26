package org.gradle.test.performancenull_201;

import static org.junit.Assert.*;

public class Testnull_20037 {
    private final Productionnull_20037 production = new Productionnull_20037("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}