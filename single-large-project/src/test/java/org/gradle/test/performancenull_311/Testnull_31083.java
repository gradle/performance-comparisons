package org.gradle.test.performancenull_311;

import static org.junit.Assert.*;

public class Testnull_31083 {
    private final Productionnull_31083 production = new Productionnull_31083("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}