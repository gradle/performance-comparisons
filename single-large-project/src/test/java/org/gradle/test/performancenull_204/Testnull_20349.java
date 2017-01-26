package org.gradle.test.performancenull_204;

import static org.junit.Assert.*;

public class Testnull_20349 {
    private final Productionnull_20349 production = new Productionnull_20349("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}