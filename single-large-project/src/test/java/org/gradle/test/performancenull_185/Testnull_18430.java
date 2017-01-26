package org.gradle.test.performancenull_185;

import static org.junit.Assert.*;

public class Testnull_18430 {
    private final Productionnull_18430 production = new Productionnull_18430("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}