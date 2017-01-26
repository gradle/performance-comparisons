package org.gradle.test.performancenull_245;

import static org.junit.Assert.*;

public class Testnull_24421 {
    private final Productionnull_24421 production = new Productionnull_24421("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}