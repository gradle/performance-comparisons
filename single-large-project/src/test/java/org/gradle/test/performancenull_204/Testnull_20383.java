package org.gradle.test.performancenull_204;

import static org.junit.Assert.*;

public class Testnull_20383 {
    private final Productionnull_20383 production = new Productionnull_20383("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}