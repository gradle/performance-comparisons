package org.gradle.test.performancenull_170;

import static org.junit.Assert.*;

public class Testnull_16950 {
    private final Productionnull_16950 production = new Productionnull_16950("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}