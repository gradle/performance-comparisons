package org.gradle.test.performancenull_206;

import static org.junit.Assert.*;

public class Testnull_20566 {
    private final Productionnull_20566 production = new Productionnull_20566("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}