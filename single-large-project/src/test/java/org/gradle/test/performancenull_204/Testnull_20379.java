package org.gradle.test.performancenull_204;

import static org.junit.Assert.*;

public class Testnull_20379 {
    private final Productionnull_20379 production = new Productionnull_20379("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}