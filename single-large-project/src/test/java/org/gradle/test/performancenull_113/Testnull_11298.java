package org.gradle.test.performancenull_113;

import static org.junit.Assert.*;

public class Testnull_11298 {
    private final Productionnull_11298 production = new Productionnull_11298("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}