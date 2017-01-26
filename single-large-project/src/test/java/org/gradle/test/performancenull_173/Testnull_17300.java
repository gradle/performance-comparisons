package org.gradle.test.performancenull_173;

import static org.junit.Assert.*;

public class Testnull_17300 {
    private final Productionnull_17300 production = new Productionnull_17300("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}