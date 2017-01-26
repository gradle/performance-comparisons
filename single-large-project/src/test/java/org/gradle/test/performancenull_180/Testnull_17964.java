package org.gradle.test.performancenull_180;

import static org.junit.Assert.*;

public class Testnull_17964 {
    private final Productionnull_17964 production = new Productionnull_17964("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}