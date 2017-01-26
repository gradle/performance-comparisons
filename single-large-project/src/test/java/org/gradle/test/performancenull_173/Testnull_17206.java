package org.gradle.test.performancenull_173;

import static org.junit.Assert.*;

public class Testnull_17206 {
    private final Productionnull_17206 production = new Productionnull_17206("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}