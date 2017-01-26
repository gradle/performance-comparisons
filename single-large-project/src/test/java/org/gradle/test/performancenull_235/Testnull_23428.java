package org.gradle.test.performancenull_235;

import static org.junit.Assert.*;

public class Testnull_23428 {
    private final Productionnull_23428 production = new Productionnull_23428("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}