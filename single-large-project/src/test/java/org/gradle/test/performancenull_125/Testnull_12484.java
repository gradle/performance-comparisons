package org.gradle.test.performancenull_125;

import static org.junit.Assert.*;

public class Testnull_12484 {
    private final Productionnull_12484 production = new Productionnull_12484("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}