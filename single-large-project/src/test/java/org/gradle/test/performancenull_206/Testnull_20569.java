package org.gradle.test.performancenull_206;

import static org.junit.Assert.*;

public class Testnull_20569 {
    private final Productionnull_20569 production = new Productionnull_20569("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}