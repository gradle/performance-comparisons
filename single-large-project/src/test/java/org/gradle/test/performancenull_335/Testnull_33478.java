package org.gradle.test.performancenull_335;

import static org.junit.Assert.*;

public class Testnull_33478 {
    private final Productionnull_33478 production = new Productionnull_33478("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}