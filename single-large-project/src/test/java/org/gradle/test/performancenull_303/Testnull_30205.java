package org.gradle.test.performancenull_303;

import static org.junit.Assert.*;

public class Testnull_30205 {
    private final Productionnull_30205 production = new Productionnull_30205("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}