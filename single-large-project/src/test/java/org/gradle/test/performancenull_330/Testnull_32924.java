package org.gradle.test.performancenull_330;

import static org.junit.Assert.*;

public class Testnull_32924 {
    private final Productionnull_32924 production = new Productionnull_32924("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}