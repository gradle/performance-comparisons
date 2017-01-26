package org.gradle.test.performancenull_173;

import static org.junit.Assert.*;

public class Testnull_17285 {
    private final Productionnull_17285 production = new Productionnull_17285("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}