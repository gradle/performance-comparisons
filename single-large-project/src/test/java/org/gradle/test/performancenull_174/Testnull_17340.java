package org.gradle.test.performancenull_174;

import static org.junit.Assert.*;

public class Testnull_17340 {
    private final Productionnull_17340 production = new Productionnull_17340("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}