package org.gradle.test.performancenull_335;

import static org.junit.Assert.*;

public class Testnull_33458 {
    private final Productionnull_33458 production = new Productionnull_33458("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}