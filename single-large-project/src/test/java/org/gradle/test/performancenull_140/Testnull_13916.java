package org.gradle.test.performancenull_140;

import static org.junit.Assert.*;

public class Testnull_13916 {
    private final Productionnull_13916 production = new Productionnull_13916("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}