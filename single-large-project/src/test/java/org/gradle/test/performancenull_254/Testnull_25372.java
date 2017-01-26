package org.gradle.test.performancenull_254;

import static org.junit.Assert.*;

public class Testnull_25372 {
    private final Productionnull_25372 production = new Productionnull_25372("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}