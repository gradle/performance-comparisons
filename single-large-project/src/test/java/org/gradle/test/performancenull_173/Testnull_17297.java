package org.gradle.test.performancenull_173;

import static org.junit.Assert.*;

public class Testnull_17297 {
    private final Productionnull_17297 production = new Productionnull_17297("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}