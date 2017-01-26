package org.gradle.test.performancenull_311;

import static org.junit.Assert.*;

public class Testnull_31064 {
    private final Productionnull_31064 production = new Productionnull_31064("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}