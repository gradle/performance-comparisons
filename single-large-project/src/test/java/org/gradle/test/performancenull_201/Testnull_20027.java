package org.gradle.test.performancenull_201;

import static org.junit.Assert.*;

public class Testnull_20027 {
    private final Productionnull_20027 production = new Productionnull_20027("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}