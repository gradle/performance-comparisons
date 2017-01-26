package org.gradle.test.performancenull_130;

import static org.junit.Assert.*;

public class Testnull_12977 {
    private final Productionnull_12977 production = new Productionnull_12977("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}