package org.gradle.test.performancenull_174;

import static org.junit.Assert.*;

public class Testnull_17398 {
    private final Productionnull_17398 production = new Productionnull_17398("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}