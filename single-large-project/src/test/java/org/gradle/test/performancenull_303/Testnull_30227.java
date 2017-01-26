package org.gradle.test.performancenull_303;

import static org.junit.Assert.*;

public class Testnull_30227 {
    private final Productionnull_30227 production = new Productionnull_30227("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}