package org.gradle.test.performancenull_125;

import static org.junit.Assert.*;

public class Testnull_12430 {
    private final Productionnull_12430 production = new Productionnull_12430("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}