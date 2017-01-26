package org.gradle.test.performancenull_173;

import static org.junit.Assert.*;

public class Testnull_17265 {
    private final Productionnull_17265 production = new Productionnull_17265("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}