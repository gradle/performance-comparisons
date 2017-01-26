package org.gradle.test.performancenull_323;

import static org.junit.Assert.*;

public class Testnull_32228 {
    private final Productionnull_32228 production = new Productionnull_32228("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}