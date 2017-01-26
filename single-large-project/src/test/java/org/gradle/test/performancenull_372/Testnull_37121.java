package org.gradle.test.performancenull_372;

import static org.junit.Assert.*;

public class Testnull_37121 {
    private final Productionnull_37121 production = new Productionnull_37121("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}