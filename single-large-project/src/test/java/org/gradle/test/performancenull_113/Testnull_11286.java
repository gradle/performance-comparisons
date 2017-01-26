package org.gradle.test.performancenull_113;

import static org.junit.Assert.*;

public class Testnull_11286 {
    private final Productionnull_11286 production = new Productionnull_11286("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}