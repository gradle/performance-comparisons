package org.gradle.test.performancenull_375;

import static org.junit.Assert.*;

public class Testnull_37484 {
    private final Productionnull_37484 production = new Productionnull_37484("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}