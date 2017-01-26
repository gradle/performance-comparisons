package org.gradle.test.performancenull_173;

import static org.junit.Assert.*;

public class Testnull_17256 {
    private final Productionnull_17256 production = new Productionnull_17256("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}