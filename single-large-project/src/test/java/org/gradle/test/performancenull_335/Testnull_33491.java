package org.gradle.test.performancenull_335;

import static org.junit.Assert.*;

public class Testnull_33491 {
    private final Productionnull_33491 production = new Productionnull_33491("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}