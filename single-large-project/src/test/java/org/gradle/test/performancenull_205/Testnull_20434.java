package org.gradle.test.performancenull_205;

import static org.junit.Assert.*;

public class Testnull_20434 {
    private final Productionnull_20434 production = new Productionnull_20434("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}