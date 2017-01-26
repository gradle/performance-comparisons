package org.gradle.test.performancenull_201;

import static org.junit.Assert.*;

public class Testnull_20032 {
    private final Productionnull_20032 production = new Productionnull_20032("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}