package org.gradle.test.performancenull_335;

import static org.junit.Assert.*;

public class Testnull_33493 {
    private final Productionnull_33493 production = new Productionnull_33493("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}