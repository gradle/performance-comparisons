package org.gradle.test.performancenull_221;

import static org.junit.Assert.*;

public class Testnull_22076 {
    private final Productionnull_22076 production = new Productionnull_22076("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}