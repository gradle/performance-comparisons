package org.gradle.test.performancenull_173;

import static org.junit.Assert.*;

public class Testnull_17298 {
    private final Productionnull_17298 production = new Productionnull_17298("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}