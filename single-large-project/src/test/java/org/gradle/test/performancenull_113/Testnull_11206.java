package org.gradle.test.performancenull_113;

import static org.junit.Assert.*;

public class Testnull_11206 {
    private final Productionnull_11206 production = new Productionnull_11206("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}