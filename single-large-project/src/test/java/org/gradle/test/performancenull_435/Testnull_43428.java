package org.gradle.test.performancenull_435;

import static org.junit.Assert.*;

public class Testnull_43428 {
    private final Productionnull_43428 production = new Productionnull_43428("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}