package org.gradle.test.performancenull_64;

import static org.junit.Assert.*;

public class Testnull_6400 {
    private final Productionnull_6400 production = new Productionnull_6400("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}