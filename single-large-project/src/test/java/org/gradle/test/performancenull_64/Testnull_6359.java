package org.gradle.test.performancenull_64;

import static org.junit.Assert.*;

public class Testnull_6359 {
    private final Productionnull_6359 production = new Productionnull_6359("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}