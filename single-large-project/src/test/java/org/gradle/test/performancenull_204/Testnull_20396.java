package org.gradle.test.performancenull_204;

import static org.junit.Assert.*;

public class Testnull_20396 {
    private final Productionnull_20396 production = new Productionnull_20396("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}