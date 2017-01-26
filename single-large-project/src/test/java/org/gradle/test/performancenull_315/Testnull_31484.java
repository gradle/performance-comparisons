package org.gradle.test.performancenull_315;

import static org.junit.Assert.*;

public class Testnull_31484 {
    private final Productionnull_31484 production = new Productionnull_31484("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}