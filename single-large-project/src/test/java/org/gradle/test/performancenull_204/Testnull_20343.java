package org.gradle.test.performancenull_204;

import static org.junit.Assert.*;

public class Testnull_20343 {
    private final Productionnull_20343 production = new Productionnull_20343("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}