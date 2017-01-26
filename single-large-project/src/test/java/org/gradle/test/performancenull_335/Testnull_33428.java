package org.gradle.test.performancenull_335;

import static org.junit.Assert.*;

public class Testnull_33428 {
    private final Productionnull_33428 production = new Productionnull_33428("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}