package org.gradle.test.performancenull_173;

import static org.junit.Assert.*;

public class Testnull_17262 {
    private final Productionnull_17262 production = new Productionnull_17262("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}