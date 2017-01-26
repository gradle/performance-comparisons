package org.gradle.test.performancenull_64;

import static org.junit.Assert.*;

public class Testnull_6396 {
    private final Productionnull_6396 production = new Productionnull_6396("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}