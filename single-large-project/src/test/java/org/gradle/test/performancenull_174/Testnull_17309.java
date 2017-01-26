package org.gradle.test.performancenull_174;

import static org.junit.Assert.*;

public class Testnull_17309 {
    private final Productionnull_17309 production = new Productionnull_17309("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}