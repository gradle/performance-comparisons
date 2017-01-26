package org.gradle.test.performancenull_207;

import static org.junit.Assert.*;

public class Testnull_20677 {
    private final Productionnull_20677 production = new Productionnull_20677("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}